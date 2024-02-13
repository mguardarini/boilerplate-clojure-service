(ns integration.happy-path-for-greetings
  (:require [clojure.test :refer [deftest testing is]]
            [helpers.http :as http]))

(deftest get-the-message-from-welcome-path
  (testing "GET /api/hello should return the hello default message"
    (let [response (http/get "/api/welcome")]
      (is (= 200 (:status response)))
      (is (contains? (:headers response) "Content-Type"))
      (is (= "Welcome Mauro!" (:body response))))))
