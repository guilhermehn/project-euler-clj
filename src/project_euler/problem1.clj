(defn problem1 []
  (reduce +
    (filter
      (fn [n]
        (or
          (zero? (mod n 3))
          (zero? (mod n 5))))
      (range 1000))))
