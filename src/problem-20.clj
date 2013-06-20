; Problem 20: Remove the k-th element from a list.

(defn remove-at [coll k]
  (if (= 1 k) (rest coll)
      (cons (first coll) (remove-at (rest coll) (dec k)))))
