(ns boilerplate.routes
  (:require [clojure.core]
            [compojure.core :refer [defroutes GET]]
            [boilerplate.controller.greeting :as controller.greeting]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [compojure.route :as route]))

(defn welcome-handler [components]
  {:status 200
   :headers {"Content-Type" "text/json"}
   :body    (controller.greeting/welcome)})

(defroutes greeting
           (GET "/api/welcome"          [] welcome-handler)
           (route/not-found "Error, page not found!"))

(def app-routes (wrap-defaults #'greeting site-defaults))
