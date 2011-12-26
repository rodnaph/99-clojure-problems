(ns lisp-problems.arithmetic)

;  P31 (**) Determine whether a given integer number is prime.
;    Example:
;    * (is-prime 7)
;    T

(defn is-prime? [num]
  (when (> num 1)
    (every? (fn [x] (not (zero? (rem x num))))
      (range 2 (inc (int (Math/sqrt num)))))))


