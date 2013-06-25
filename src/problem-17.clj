; Problem 17: Split a list into two parts; the length of the first part is given.

(defn split 
  "Returns a pair of sequences: one containing the first n elements of coll and the other containing the remaining elements of coll."
  [coll n]
  (loop [a '() z coll x n]
    (if (= 0 x) (concat (list (reverse a)) (list z))
        (recur (cons (first z) a) (rest z) (dec x)))))

(defn split-2
    "Returns a pair of sequences: one containing the first n elements of coll and the other containing the remaining elements of coll."
    [coll n]
    (cons (take n coll) (list (drop n coll))))
