; Problem 19: Rotate a list n places to the left. 

(defn rotate [coll n] (cond 
                       (pos? n) (concat (drop n coll) (take n coll))
                       (neg? n) (concat (drop (- (count coll) (* n -1)) coll) (take (- (count coll) (* n -1)) coll))
                       (zero? n) coll))
