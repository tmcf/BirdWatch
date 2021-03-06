(defproject birdwatch-tc "0.2.0-SNAPSHOT"
  :description "Twitter client part of the BirdWatch system"
  :url "https://github.com/matthiasn/Birdwatch"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [twitter-api "0.7.8"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [clojurewerkz/elastisch "2.2.0-beta3"]
                 [org.clojure/tools.logging "0.3.1"]
                 [matthiasn/systems-toolbox "0.1.32-SNAPSHOT"] ;; please install locally for now with 'lein run'
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [clj-time "0.9.0"]
                 [clj-pid "0.1.2"]
                 [com.taoensso/carmine "2.10.0"]
                 [metrics-clojure "2.5.1"]]

  :source-paths ["src/clj/"]

  :main ^:skip-aot birdwatch-tc.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :plugins [[quickie "0.3.5" :exclusions [org.clojure/clojure org.codehaus.plexus/plexus-utils]]])
