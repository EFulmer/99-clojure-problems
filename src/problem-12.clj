; Problem 12: Decode a run-length encoded list.

; Direct recursion with destructuring (hooray!)
(defn my-decode ([[num elem] & more] (flatten (cons (repeat num elem) (my-decode more))))
  ([xs] (if (empty? xs) xs (flatten (cons (first xs) (my-decode (rest xs)))))))

; Recur:
(defn my-decode-2 ([xs] (my-decode-2 [] xs))
  ([acc xs] (cond (empty? xs) (flatten acc)
                  (list? (first xs)) (recur (conj acc (repeat (first xs) (second xs))) (rest xs))
                  true (recur (conj acc (first xs)) (rest xs)))))
