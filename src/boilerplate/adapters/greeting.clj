;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(ns boilerplate.adapters.greeting
  (:require [schema.core :as s]))

(s/defn welcome :- s/Str
  [name]
  (str "Welcome " name "!"))
