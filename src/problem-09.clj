; Problem 09: Pack consecutive duplicate list elements into sublists.

; Direct recursion:
(defn pack [xs]
  (cond (empty? xs) xs
        true (conj (pack (drop-while (fn [x] (= x (first xs))) xs)) (take-while (fn [x] (= x (first xs))) xs))))

; Recursion using loop-recur:
(defn pack-2 [xs]
  (loop [acc [] xs xs]
    (cond (empty? xs) acc
          true (recur (conj acc (take-while (fn [x] (= x (first xs))) xs))
                      (drop-while (fn [x] (= x (first xs))) xs)))))
