; Problem 13: Run-length encoding of a list (direct solution).

(defn encode-direct [xs]
  (letfn [(end-run [n x] (if (zero? n) x (list (inc n) x)))
          (acc [n xs]
            (cond (empty? (rest xs)) (list (end-run n (first xs)))
                  (= (first xs) (second xs)) (acc (inc n) (rest xs))
                  true (cons (end-run n (first xs)) (acc 0 (rest xs)))))]
    (acc 0 xs)))
