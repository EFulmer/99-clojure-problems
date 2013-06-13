; Problem 5: Reverse a list.

; direct recursion
(defn my-reverse [xs]
  (if (empty? xs) []
      (conj (my-reverse (rest xs)) (first xs))))

; Recursion with loop:
