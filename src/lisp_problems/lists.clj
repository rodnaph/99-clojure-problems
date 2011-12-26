(ns lisp-problems.lists)

;  P01 (*) Find the last box of a list.
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

;  P02 (*) Find the last but one box of a list.
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

;  P03 (*) Find the K'th element of a list.
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

; A loop based solution
(defn number-of-elements-3 [lst]
  (loop [a 0 l lst]
    (if (empty? l) a
      (recur (inc a) (rest l)))))

; P05 (*) Reverse a list.
; Take the first item and then cons a new list? (1 2 3) => (3 2 1)

(defn simple-reverse [lst] (reverse lst))

(defn my-reverse [lst]
  (reduce (fn [r x] (cons x r)) '() lst))      

; P06 (*) Find out whether a list is a palindrome.
; A palindrome can be read forward or backward; e.g. (x a m a x).

(defn palindrome [x]
  (= (reverse x) x))

;  P07 (**) Flatten a nested list structure.
;    Transform a list, possibly holding lists as elements into a `flat'
;    list by replacing each list with its elements (recursively).
;   
;    Example:
;      * (my-flatten '(a (b (c d) e)))
;      (A B C D E)

(defn my-flatten [x]
  (flatten x))

;  P08 (**) Eliminate consecutive duplicates of list elements.
;    If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
;   
;    Example:
;    * (compress '(a a a a b c c a a d e e e e))
;    (A B C A D E)

(defn compress [x]
 ())

