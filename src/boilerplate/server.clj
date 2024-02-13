;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.server
  (:require [boilerplate.components :as components]
            [com.stuartsierra.component :as component])
  (:gen-class))

(defn -main
  [& args]
  (let [system (components/start)]
    (println "Server started on port 3004.")
    (component/start (-> system ::component/system :http-server))))


