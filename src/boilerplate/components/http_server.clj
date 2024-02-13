;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.components.http-server
  (:require [com.stuartsierra.component :as component]
            [org.httpkit.server :as http]))

(defrecord HttpServer [port handler]
  component/Lifecycle
  (start [component]
    (let [server (http/run-server handler {:port port})]
      (assoc component :server server)))
  (stop [component]
    (when-let [server (:server component)]
      (.close server))
    (dissoc component :server)))

(defn create [port handler]
  (->HttpServer port handler))
