
(ns lisp_problems.test.trees
  (:use [lisp-problems.trees])
  (:use [clojure.test]))

(deftest test-is-binary-tree
    (is (binary-tree? '(a nil nil)))
    (is (binary-tree? '(a (b nil nil) nil))))

