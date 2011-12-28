(ns lisp_problems.test.lists
  (:use [lisp-problems.lists])
  (:use [clojure.test]))

(deftest test-returns-last-element-of-list
  "Should return the last element of a list"
  (let [x (list 1 2 3 4 5)]
    (is (= (my-last x) 5))
    (is (= (my-last-2 x) 5))))

(deftest test-returns-last-but-one-of-list
  "Should return the last but one element of a list"
  (let [x (list 1 2 3 4 5)]
    (is (= (my-but-last x) 4))))

(deftest test-get-n-in-list
  "Get the nth element in a list"
  (let [x (list 1 2 3 4 5 6 7)]
   (is (= (element-at x 2) 3))
   (is (= (element-at-2 x 2) 3))))

(deftest test-counts-elements-in-list
  "Count the number of elements in a list"
  (let [x (list 1 2 3 4)
        y (list 9 8 7 6 5 4 3 2 1)]
    (is (= (number-of-elements y) 9))
    (is (= (number-of-elements-2 y) 9))
    (is (= (number-of-elements-3 y) 9))))

(deftest test-reverses-a-list
  "Can reverse the elements in a list"
  (let [x (list 1 2 3)]
    (is (= (my-reverse x) '(3 2 1)))))

(deftest test-palindrome
  (let [pal '(1 2 3 2 1)
        no-pal '(1 2 3 4 5)]
  (is (= (palindrome pal) true))
  (is (= (palindrome no-pal) false))))

(deftest test-flatten
    (let [lst '(1 2 (3 (4) 5) 6 7)
          flat (range 1 8)]
        (is (= (my-flatten lst) flat))
    ))

(deftest test-compress
    (let [lst '(a a a b b a a c c c c d d)
          cmp '(a b a c d)]
        (is (= (my-compress lst) cmp))
    )
)

