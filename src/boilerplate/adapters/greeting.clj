(ns boilerplate.adapters.greeting
  (:require [schema.core :as s]))

(s/defn welcome :- s/Str
  [name]
  (str "Welcome " name "!"))
