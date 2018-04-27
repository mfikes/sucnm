(ns producer.core
  (:require-macros [producer.core])
  (:require [third.core :as third]))

(defn my-inc* [x]
  (third/foo x))

(defn my-inc-fn [x]
  (third/foo x))
