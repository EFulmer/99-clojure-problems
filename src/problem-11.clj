; Problem 11: Modified run-length encoding.

; Problem 09's solution:
(defn pack [xs]
  (let [first-repeats (fn [x] (= x (first xs)))
        front (take-while first-repeats xs)
        back (drop-while first-repeats xs)]
    (if (empty? back) 
      (list front) 
      (cons front (pack back)))))

; Map:
(defn encode-modified [xs] (map (fn [x] (if (= 1 (count x)) (first x) (list (count x) (first x)))) (pack xs)))

; Direct recursion:

; Loop/recur:
