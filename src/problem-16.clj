; Problem 16: Drop every nth element from a list.

(defn my-drop [coll n]
  (if (<= (count coll) (- n 1))
    coll
    (concat (take (- n 1) coll) (my-drop (drop n coll) n))))
