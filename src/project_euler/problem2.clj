(defn fib
  ([l]
    (fib [1, 2] l))
  ([x, l]
    (if (> (last x) l)
      (drop-last 1 x)
      (fib (conj x (+ (last x) (nth x (- (count x) 2)))) l))))

(defn problem2 []
  (reduce + (filter even? (fib 4000000))))
