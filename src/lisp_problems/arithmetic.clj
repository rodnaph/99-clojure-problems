
(ns lisp-problems.arithmetic)

(defn is-prime? [num]
    (every?
        #(> %1 0)
        (map #(rem num %1)
            (range 2 (java.lang.Math/sqrt num)))))

(defn gcd
    "Calculate greatest common divisor using Euclids algorithm"
    [x y]
    (loop [a x b y]
        (let [c (rem a b)]
            (if (= 0 c)
                b
                (recur b c)))))

(defn coprime?
    "Indicates if two numbers are coprimes"
    [x y]
    (= 1 (gcd x y)))

(defn totient
    [m]
    (reduce
        #(if (coprime? m %2) (inc %1) %1)
        0 
        (range 1 m)
    ))

