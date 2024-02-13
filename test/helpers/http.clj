(ns helpers.http
  (:require [com.stuartsierra.component :as component]
            [boilerplate.components :as components]
            [boilerplate.config :as config]
            [clj-http.client :as http]))

(def system (components/start))

(defn start-web-server []
  (component/start (-> system ::component/system :http-server)))

(defn- stop-web-server []
  (component/stop (-> system ::component/system :http-server)))

(defn get [path]
  (let [response (http/get (str config/service path))]
    (start-web-server)
    response
    (stop-web-server)))
