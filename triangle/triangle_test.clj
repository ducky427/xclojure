(ns triangle.test (:require [clojure.test :refer :all]))
(load-file "triangle.clj")

(deftest equilateral-1
  (is (= :equilateral (triangle/triangle 2 2 2))))
(deftest equilateral-2
  (is (= :equilateral (triangle/triangle 10 10 10))))
(deftest isoceles-1
  (is (= :isosceles (triangle/triangle 3 4 4))))
(deftest isoceles-2
  (is (= :isosceles (triangle/triangle 4 3 4))))
(deftest scalene
  (is (= :scalene (triangle/triangle 3 4 5))))
(deftest invalid-1
  (is (= :illogical (triangle/triangle 1 1 50))))
(deftest invalid-2
  (is (= :illogical (triangle/triangle 1 2 1))))

(run-tests)

