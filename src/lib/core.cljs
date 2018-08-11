(ns lib.core
  (:require-macros [lib.core])
  (:require [clojure.set]))

(defn inverse* [m]
  (into {} (map (fn [[k v]]
                  [v k])
             m)))
