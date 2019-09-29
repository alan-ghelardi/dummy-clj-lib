(ns dummy-clj-lib.core-test
  (:require [clojure.test :refer :all]
            [dummy-clj-lib.core :refer :all]))

(deftest a-test
  (testing "Very simple test"
    (is (= 1 1))))
