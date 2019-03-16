(defproject ib-re-actor "0.2.1-SNAPSHOT"
  :description "Clojure friendly wrapper for InteractiveBrokers java API"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-time "0.15.1"]
                 [org.clojure/tools.logging "0.4.1"]
                 [clj-logging-config "1.9.12"]]
  :profiles {:dev {:dependencies [[twsapi "9.71.01"]
                                  [midje "1.9.6"]]
                   :plugins [[lein-midje "3.2.1"]
                             [com.gfredericks/how-to-ns "0.1.6"]]
                   :how-to-ns {:require-docstring? false}}})
