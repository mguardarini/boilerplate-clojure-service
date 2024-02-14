(ns integration.happy-path-for-greetings
  (:require [state-flow.core :refer [flow]]
            [helpers.init :refer [defflow]]
            [state-flow.assertions.matcher-combinators :refer [match?]]
            [helpers.http :as http]))

(def happy-path-test)
(defflow happy-path-test
    (flow "Should be return a Welcome with the name of the person hard coded."
          [:let [{:keys [status body]} (http/->get "/api/welcome")] ]
          (match? 200 status)
          (match? "Welcome Mauro!" body)))
