
(ns lisp_problems.test.arithmetic
  (:use [lisp-problems.arithmetic])
  (:use [clojure.test]))

(def prime-list (list 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))

(deftest test-prime-numbers
    (is (= false (every? #(is-prime? %) '(1 2 3))))
    (is (= true (every? #(is-prime? %) prime-list))))

