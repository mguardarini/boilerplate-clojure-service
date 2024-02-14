(ns helpers.http
  (:require [boilerplate.config :as config]
            [clj-http.client :as http]))

(defn ->get [path]
  (let [response (http/get (str config/service path))]
    {:status  (:status response)
     :body    (:body response)
     :headers (:headers response)}))
