; Problem 4: Find the number of elements in a list.

(defn my-length [xs]
  (loop [acc 0 ls 1]
    (if (empty? ls)
      0
      (recur (inc acc) (rest ls)))))
