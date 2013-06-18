; Problem 14: Duplicate the elements of a list.

(defn duplicate [xs]
  (if (empty? xs) xs
      (cons (first xs) (cons (first xs) (duplicate (rest xs))))))
