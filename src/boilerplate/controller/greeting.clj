(ns boilerplate.controller.greeting
        (:require [schema.core :as s]
                  [boilerplate.adapters.greeting :as adapters.greeting]))

(s/defn welcome [] (adapters.greeting/welcome "Mauro"))
