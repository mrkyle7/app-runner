(defproject leinapp "1.0-SNAPSHOT"
            :main leinapp.core
            :profiles {:uberjar {:aot :all}}
            :dependencies [[org.clojure/clojure "1.7.0"]
                           [ring/ring-core "1.9.4"]
                           [ring/ring-jetty-adapter "1.9.4"]
                           [ring/ring-defaults "0.3.3"]
                           [compojure "1.6.2"]]
            :plugins [[lein-ring "0.12.5"]]
            :ring {:handler leinapp.core/app})
