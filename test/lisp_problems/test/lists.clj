(ns lisp_problems.test.lists
  (:use [lisp-problems.lists])
  (:use [clojure.test]))

(deftest test-returns-last-element-of-list
  "Should return the last element of a list"
  (let [x (list 1 2 3 4 5)]
    (is (= (my-last x) 5))
    (is (= (my-last-2 x) 5))
    (is (= (my-last-3 x) 5))))

(deftest test-returns-last-but-one-of-list
  "Should return the last but one element of a list"
  (let [x (list 1 2 3 4 5)]
    (is (= (my-but-last x) 4))
    (is (= (my-but-last-2 x) 4))
    (is (= (my-but-last-3 x) 4))))


