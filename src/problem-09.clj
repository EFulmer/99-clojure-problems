; Problem 09: Pack consecutive duplicate list elements into sublists.

(defn pack [xs]
  (loop [acc [] cca xs]
    (cond (empty? cca) acc
          (= (last acc) (first cca)) (recur (conj (first cca) acc) (rest cca))
          true (recur (conj acc '()) (rest cca)))))
