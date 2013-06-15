; Problem 08: Eliminate consecutive duplicates of list elements.

; Direct recursion:
(defn my-compress [xs]
  (let [first-repeats (fn [x] (= x (first xs)))
        front (take-while first-repeats xs)
        back (drop-while first-repeats xs)]
    (if (empty? back) 
      (list front) 
      (cons front (my-compress back)))))

; Recursion with loop:
(defn my-compress-2 [xs]
  (loop [acc [(first xs)] cca (rest xs)]
    (cond (empty? cca) acc
          (= (first cca) (last acc)) (recur acc (rest cca))
          true (recur (conj acc (first cca)) (rest cca)))))
