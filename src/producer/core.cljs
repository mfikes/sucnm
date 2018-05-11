(ns producer.core
  (:require-macros [producer.core])
  (:require [clojure.set]))

(defn inverse* [m]
  (into {} (map (fn [[k v]]
                  [v k])
             m)))
