(defproject day-of-datomic "1.0.0-SNAPSHOT"
  :description "Sample Code for Day of Datomic Presentation"
  :plugins [[lein-tg "0.0.1"]]
  :jvm-opts ["-Xmx1g" "-server"]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/test.generative "0.5.2"]
                 [org.clojure/core.async "1.0.567"]
                 [com.datomic/datomic-free "0.9.5656"]
                 [incanter/incanter-charts "1.9.0"]
                 [incanter/incanter-pdf "1.9.0"]])
