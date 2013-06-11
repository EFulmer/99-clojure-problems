(defn last-but-one [xs] 
  (if (= 1 (count (rest xs)))
    (first xs)
    (last-but-one (rest xs))))

; ugly imperative-looking version

