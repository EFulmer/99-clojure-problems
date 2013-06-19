; Problem 15: Replicate the elements of a list a given number of times.

(defn replicate [coll n]
  (letfn [(acc [c x] (if (zero? n) (replicate (rest coll x)) (cons c (acc c (dec x)))))]
    (if (empty? coll) coll
        (cons (acc (first coll) n) (replicate (rest coll) n)))))
