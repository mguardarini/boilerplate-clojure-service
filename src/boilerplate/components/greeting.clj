;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.components.greeting
  (:require [com.stuartsierra.component :as component]))

(defrecord greeting [text]
  component/Lifecycle
  (start [component]
    (let [greeting text]
      (println "Start the greeting component")
      (assoc component :greeting greeting)))
  (stop [component]
    (when-let [dummy (:greeting component)]
      (println "Stop the greeting component")
      (.close dummy))
    (dissoc component :greeting)))

(defn create [text]
  (->greeting text))
