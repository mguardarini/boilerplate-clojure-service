;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.controller.greeting
        (:require [schema.core :as s]
                  [boilerplate.adapters.greeting :as adapters.greeting]))

(s/defn welcome [] (adapters.greeting/welcome "Mauro"))
