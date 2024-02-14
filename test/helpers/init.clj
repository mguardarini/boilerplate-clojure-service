(ns helpers.init
  (:require [clojure.test :refer :all]
            [schema.core :as s]
            [boilerplate.components :as components]
            [state-flow.api :as flow]))

(defn init! []
  (s/with-fn-validation {:system (components/start-system!)}))

(defn runner! [flow state]
  (s/with-fn-validation (flow/run flow state)))

(defmacro defflow
  [name & forms]
  (let [parameters {:init   init!
                    :runner runner!}
        [parameters & flows] (cons parameters forms)]
    `(state-flow.api/defflow ~name ~parameters ~@flows)))

