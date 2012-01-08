
(ns lisp-problems.trees)

(defn binary-tree?
    "Indicates if the given list is a binrary tree structure"
    [node]
    (if (nil? node) true
        (and (= 3 (count node)) 
             (binary-tree? (nth node 1)) 
             (binary-tree? (nth node 2)))))

