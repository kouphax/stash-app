(defproject stash-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [ring "1.2.2"]
                 [clj-http "0.7.9"]
                 [hiccup "1.0.5"]
                 [org.clojure/data.json "0.2.4"]
                 [buddy "0.1.1"]]
  :main ^:skip-aot stash-app.core)
