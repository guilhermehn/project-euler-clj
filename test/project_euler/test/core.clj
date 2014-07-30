(ns project-euler.test.core
  (:use [project-euler.core])
  (:use [clojure.test]))

(deftest p1
  (is (= (problem1) 233168)))

(deftest p2
  (is (= (problem2) 4613732)))

(deftest p3
  (is (= (problem3) 6857)))
