; Problem 23: Extract a given number of randomly selected elements from a list.

(defn rnd-select [coll n]
  (loop [n n acc '() coll coll]
    (if (= 0 n) acc
        (let [rnd-pick (rand-nth coll)]
          (recur (dec n) 
                 (cons rnd-pick acc) 
                 (remove (fn [x] (= x rnd-pick)) coll))))))
