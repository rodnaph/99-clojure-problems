
(ns lisp-problems.arithmetic)

(defn is-prime? [num]
    (every?
        #(> %1 0)
        (map #(rem num %1)
            (range 2 (java.lang.Math/sqrt num)))))

