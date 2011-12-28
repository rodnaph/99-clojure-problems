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

; consumes stack...
(defn my-flatten [x]
    (reduce
        (fn [acc e]
            (if (list? e)
                (concat acc (my-flatten e))
                (concat acc (list e)))
        )
        '()
        x
    ))

(defn my-compress [lst]
    (reduce (fn [acc e]
        (cond
            (or (empty? acc) 
                (not (= e (last acc))))
                (concat acc (list e))
            :default acc
        )
    ) '() lst))

(defn my-compress-2 [lst]
    (map first (partition-by identity lst)))

(defn my-pack [lst]
    (partition-by identity lst))

(defn my-pack-2 [lst]
    (-> (reduce
            (fn [acc e]
                (let [vals (-> (get acc e)
                            count
                            inc)]
                    (assoc acc e (repeat vals e)))
            )
            (hash-map)
            lst
        )
        vals
        reverse))

