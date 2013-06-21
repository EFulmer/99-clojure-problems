; Problem 17: Split a list into two parts; the length of the first part is given.

(defn split [coll n]
  (loop [a '() z coll x n]
    (if (= 0 x) (concat (list (reverse a)) (list z))
        (recur (cons (first z) a) (rest z) (dec x)))))
