; Problem 09: Pack consecutive duplicate list elements into sublists.

; Recursion using loop-recur:
(defn pack[xs]
  (loop [acc [] xs xs]
    (cond (empty? xs) acc
          true (recur (conj acc (take-while (fn [x] (= x (first xs))) xs))
                      (drop-while (fn [x] (= x (first xs))) xs)))))
