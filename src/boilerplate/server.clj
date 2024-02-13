(ns boilerplate.server
  (:require [boilerplate.components :as components]
            [com.stuartsierra.component :as component]))

(defn -main
  [& args]
  (let [system (components/start)]
    (println "Server started on port 3004.")
    (component/start (-> system ::component/system :http-server))))


