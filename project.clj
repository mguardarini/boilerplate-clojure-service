;Author: Mauro Guardarini
;Fork the repository and drop a star to keep contributing to the project. Every star helps in making this repository better!

(defproject boilerplate "0.1.0-SNAPSHOT"
  :description "This is a boilerplate for clojure service"
  :url "https://github.com/mguardarini/boilerplate-clojure-service"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [com.stuartsierra/dependency "1.0.0"]
                 [com.stuartsierra/component "1.1.0"]
                 [ring/ring-defaults "0.3.2"]
                 [prismatic/schema "1.4.1"]
                 [clj-http "3.12.3"]
                 [nubank/state-flow "5.14.5"]]
  :resource-paths ["resources"]
  :repl-options {:init-ns boilerplate.server})
