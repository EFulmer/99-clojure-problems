; Problem 24: Lotto: Draw N different random numbers from the set 1..M.

(defn rand-select [n m]
  "Returns a random selection of n numbers from the set 1..m."
  ; initialize the list that numbers are taken from with (range m), then 
  ; keep randomly picking numbers from the list, adding them to the 
  ; accumulator, and removing them from rng.
  (loop [n n rng (range m) acc '()]
    (if (= 0 n)
      acc
      (let [lotto-ball (rand-nth rng)]
        (recur (dec n) 
               (remove (fn [x] (= x lotto-ball)) rng) 
               (cons lotto-ball acc))))))
