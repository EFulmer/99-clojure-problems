; Problem 22: Create a list containing all integers within a given range.

(defn my-range 
  "Returns a sequence of all numbers between a and b, including both a and b. If b is greater than a, the sequence will be produced in descending order."
  [a b]
  (cond (= a b) (list a)
        (< a b) (cons a (my-range (inc a) b))
        :else (reverse (my-range b a))))
