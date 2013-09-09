; Problem 25: Generate a random permutation of the elements of a list

(defn rnd-permu [coll]
  (loop [acc '() coll coll]
    (if (empty? coll) acc
        (let [rnd-pick (rand-nth coll)]
          (recur (cons rnd-pick acc) 
                 (remove (fn [x] (= x rnd-pick)) coll))))))

; without loop/recur:
(defn rnd-permu' [coll]
  (letfn [(acc [perm coll]
            (if (empty? coll) perm
                (let [rnd-pick (rand-nth coll)]
                  (acc (cons rnd-pick perm)
                       (remove (fn [x] (= x rnd-pick)) coll)))))]
    (acc '() coll)))
