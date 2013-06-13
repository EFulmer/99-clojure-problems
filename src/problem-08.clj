; Problem 08: Eliminate consecutive duplicates of list elements.

; Recursion with loop:
(defn my-compress [xs]
  (loop [acc [(first xs)] cca (rest xs)]
    (cond (empty? cca) acc
          (= (first cca) (last acc)) (recur acc (rest cca))
          true (recur (conj acc (first cca)) (rest cca))
          )))

;
