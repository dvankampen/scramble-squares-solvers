(defproject puzzle "0.1.0-SNAPSHOT"
  :description "A program to solve a scramble-squares puzzle"
  :url "https://github.com/kkredit/scramble-squares-solver"
  :license {:name "CC0 1.0 Universal"
            :url "https://creativecommons.org/publicdomain/zero/1.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"] [org.clojure/tools.trace "0.7.10"]]
  :plugins [[lein-cljfmt "0.6.7"]]
  :main puzzle.core
  :aot [puzzle.core])
