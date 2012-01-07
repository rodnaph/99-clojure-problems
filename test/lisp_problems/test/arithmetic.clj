
(ns lisp_problems.test.arithmetic
  (:use [lisp-problems.arithmetic])
  (:use [clojure.test]))

(def prime-list (list 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))

(run-tests)

(deftest test-prime-numbers
    (is (= true (every? is-prime? '(1 2 3))))
    (is (= true (every? is-prime? prime-list))))

(deftest test-gcd
    (is (= 6 (gcd 48 18))))

(deftest test-coprimes
    (is (coprime? 35 64))
    (is (not (coprime? 48 18))))

(deftest test-eulers-totient
    (is (= 4 (totient 10))))

(deftest test-prime-factors
    (is (= (prime-factors 315) '(3 3 5 7))))

