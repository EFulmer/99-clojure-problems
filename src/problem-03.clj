; Problem 3: Find the kth element of a list. The first element in the list is number 1.

(defn element-at [xs k]
  (loop [n k ls xs]
    (if (= 0 n)
      (first ls)
      (recur (dec n) (rest ls)))))

(defn element-at-2 [xs k]
  (if (= 0 k)
    (first xs)
    (element-at-2 (rest xs) (dec k))))
