#
#   Continuous Testing for Clojure
#   Watchr file for running Clojure unit tests 
#   Run this file from the base of a Leiningen project and your tests will run automatically when updated
# 

# Requires Growl for OSX Lion and growlnotify plugin and POpen4 gem

require 'find'
require 'popen4'

module ClojureWatchr

  class Base 

    def initialize *opts, &block
      system('clear')
      @path = Dir.pwd
      @project_name = Dir.getwd
      @test_dir = find_test_directory
    end
  
    #
    # Recurse through Leiningen project tree and find the test directory root
    # Worth checking as test dir isn't always the same as the base dir if a dash is used in the project name
    def find_test_directory
      collection = []
      Find.find('test/') do |i|
        collection << i
      end
      result = collection.reject {|i| !File.directory?(i) }
      dir = result[1].split('/').last
      return "test/#{dir}"
    end
   
    # Send a growl notification if growl is installed
    # Requires Growl for Lion and growlnotify plugin!
    def growl(msg)
      system("growlnotify -m #{msg.inspect}")
    end

    # Run the tests inside an IO block and capture the results of the test
    def run_all_tests
      $stdout.puts 'Running clojure test suite...'
      results = []
      status = POpen4::popen4('lein test') do |stdout, stderr, stdin|
        stdout.each do |line|
          results << line.gsub(/\n/, ' ') unless line.empty?
        end
      end
      str = results.join.to_s
      $stdout.puts str
      growl "#{str}"
    end
  
    def run
      system('clear')
      run_all_tests
    end
  end

end

w = ClojureWatchr::Base.new
watch( "#{w.find_test_directory}/test/(.*)\.clj" ) {w.run}
