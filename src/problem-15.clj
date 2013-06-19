; Problem 15: Replicate the elements of a list a given number of times.

(defn my-replicate [coll n]
  (letfn [(acc [c x] (if (zero? x) (my-replicate (rest coll) n) (cons c (acc c (dec x)))))]
    (if (empty? coll) coll
        (acc (first coll) n))))
