(ns lisp-problems.lists)

; P01 (*) Find the last box of a list.
;    Example:
;    * (my-last '(a b c d))
;    (D)

; Easy one line solution
(defn my-last [x]
  (last x))

(defn my-last-2 [x]
  (reduce #(do %2) x))

; I like this one
(defn my-last-3 [x]
  (if (empty? (rest x))
    (first x)
    (my-last-3 (rest x))))

;P02 (*) Find the last but one box of a list.
;    Example:
;    * (my-but-last '(a b c d))
;    (C D)

(defn my-but-last [x]
  (first (rest (reverse x))))

(defn my-but-last-2 [x]
  (if (empty? (rest (rest x)))
    (first x)
    (my-but-last-2 (rest x))))

; Get the length of the list and find the item at len - 1
(defn my-but-last-3 [x]
  (let [len (count x)]
    (nth x (dec (dec len)))))

(defn last-but-one-in-list [x]
  ((fn [x last]
     (if (nil? (rest (rest x)))
       last
       (recur (rest x) (first (rest x))))) x nil))

 
