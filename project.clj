(defproject boilerplate "0.1.0-SNAPSHOT"
  :description "This is a sample about use the component library from Stuart Sierra"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [com.stuartsierra/dependency "1.0.0"]
                 [com.stuartsierra/component "1.1.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-mock "0.4.0"]
                 [ring-mock "0.1.5"]
                 [prismatic/schema "1.4.1"]
                 [clj-http "3.12.3"]
                 [nubank/state-flow "5.14.5"]]
  :resource-paths ["resources"]
  :repl-options {:init-ns boilerplate.server})
