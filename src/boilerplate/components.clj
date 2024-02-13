;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.components
  (:require [com.stuartsierra.component :as component]
            [boilerplate.components.http-server :as http-server]
            [boilerplate.components.greeting :as greeting]
            [boilerplate.routes :as routes]))

(def base
  {::component/system
   (component/system-map
     ;TODO add another components here
     :http-server (http-server/create 3004 routes/app-routes)
     :greeting    (greeting/create "Hello"))})

(defn start []
  (component/start base))
