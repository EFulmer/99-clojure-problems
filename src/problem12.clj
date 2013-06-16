; Problem 12: Decode a run-length encoded list.

; Direct recursion with destructuring (hooray!)
(defn my-decode ([[num elem] & more] (cons (repeat num elem) (my-decode more)))
  ([xs] (if (empty? xs) xs (cons (first xs) (my-decode (rest xs))))))

