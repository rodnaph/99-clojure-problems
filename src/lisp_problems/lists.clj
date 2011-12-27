(ns lisp-problems.lists)

(defn my-last [x]
    (first (reverse x)))

(defn my-last-2 [x]
    (if (= 1 (count x))
        (first x)
        (recur (rest x))))

(defn my-but-last [x]
    (if (= 2 (count x))
        (first x)
        (recur (rest x))))

(defn element-at [x n]
    (nth x n))

(defn element-at-2 [x n]
    (if (= n 0)
        (first x)
        (recur (rest x) (dec n))))

(defn number-of-elements [x]
    (count x))

(defn number-of-elements-2 [x]
    (loop [xs x total 0]
        (if (empty? xs)
            total
            (recur (rest xs) (inc total)))))

(defn number-of-elements-3 [x]
    (reduce (fn [l x] (inc l)) 0 x))

(defn my-reverse [lst]
    (reduce #(cons %2 %1) '() lst))

(defn palindrome [x]
    (= x (reverse x)))


