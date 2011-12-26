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
    (recur (rest x))))

;P02 (*) Find the last but one box of a list.
;    Example:
;    * (my-but-last '(a b c d))
;    (C D)

(defn my-but-last [x]
  (first (rest (reverse x))))

(defn my-but-last-2 [x]
  (if (empty? (rest (rest x)))
    (first x)
    (recur (rest x))))

; Get the length of the list and find the item at len - 1
(defn my-but-last-3 [x]
  (let [len (count x)]
    (nth x (dec (dec len)))))

;P03 (*) Find the K'th element of a list.
;    The first element in the list is number 1.
;    Example:
;    * (element-at '(a b c d e) 3)
;    C

; Easy way
 (defn element-at [k n]
   (nth k n))

; Nice recursive solution
(defn element-at-2 [k n]
  (if (= n 0)
   (first k)
   (recur (rest k) (dec n))))

; P04 (*) Find the number of elements of a list.
 
(defn number-of-elements [lst]
  (count lst))

(defn number-of-elements-2 [lst]
  (reduce (fn [l x] (inc l)) 0 lst))
