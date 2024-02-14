;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.components
  (:require [com.stuartsierra.component :as component]
            [boilerplate.components.http-server :as http-server]
            [boilerplate.components.greeting :as greeting]
            [boilerplate.config :as config]
            [boilerplate.routes :as routes]))

(def system-started? (atom false))

(defn toggle-status []
  (swap! system-started? not))

(def base
  {::component/system
   (component/system-map
     ;TODO add another components here
     :http-server (http-server/create config/port routes/app-routes)
     :greeting    (greeting/create "Hello"))})

(defn start-system! []
  (when (= @system-started? false)
    (component/start-system base)
    (toggle-status)))
