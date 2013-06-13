; Problem 7: Flatten a nested list structure.

; Direct recursion:
(defn my-flatten [xs]
  (cond (or (list? (first xs)) (vector? (first xs))) (my-flatten (first xs))
        (empty? xs) '()
        true (cons (first xs) (my-flatten (rest xs)))))
