; Problem 18: Extract a slice from a list.

(defn slice [coll a z] (take (- z a) (drop (- a 1) coll)))
