;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.components.http-server
  (:require [com.stuartsierra.component :as component]
            [org.httpkit.server :as http]))

(def http-server-started? (atom false))

(defn toggle-status []
  (swap! http-server-started? not))

(defrecord HttpServer [port handler]
  component/Lifecycle
  (start [component]
    (when (= @http-server-started? false)
      (let [server (http/run-server handler {:port port})]
          (println "Start the Http Server Component.")
          (assoc component :server server)
          (toggle-status))))
  (stop [component]
    (when-let [server (:server component)]
      (println "Stop the Http Server Component.")
      (.close server))
    (dissoc component :server)))

(defn create [port handler]
  (->HttpServer port handler))
