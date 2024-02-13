(ns unit.boilerplate.adapters.greeting-test
  (:require [clojure.test :refer [deftest testing is]]
            [boilerplate.adapters.greeting :as adapter.greeting]
            [schema.core :as s]))

(deftest wire->internal-test
  (s/with-fn-validation
    (testing "adapt the wire for internal schema"
      (is (= "Welcome Fulano!"
             (adapter.greeting/welcome "Fulano"))))))