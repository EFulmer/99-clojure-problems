; Problem 01: Find the last item of a list.

(defn my-last [xs] 
  (if (empty? (rest xs)
              xs)
    (my-last (rest xs))))

(defn my-last-2 [xs]
  (loop [xs xs]
    (if (= 1 (count xs))
      xs
      (recur (rest xs)))))

