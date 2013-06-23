; Insert an element at a given position into a list.

(defn insert-at [item coll pos]
  (if (= pos 1)
    (cons item coll)
    (cons (first coll) (insert-at item (rest coll) (dec pos)))))
