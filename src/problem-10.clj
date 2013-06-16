; Problem 10: Run-length encoding of a list.

; Problem 09's solution:
(defn pack [xs]
  (let [first-repeats (fn [x] (= x (first xs)))
        front (take-while first-repeats xs)
        back (drop-while first-repeats xs)]
    (if (empty? back) 
      (list front) 
      (cons front (pack back)))))

; Recursion with loop:
(defn encode [xs] (map (fn [x] (list (count x) (first x))) (pack xs)))
