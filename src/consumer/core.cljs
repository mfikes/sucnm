(ns consumer.core
  (:require [producer.core :refer [my-inc my-inc-direct my-inc-fn]]))

(defn -main [& args]
  (prn (my-inc 3))
  (prn (my-inc-direct 3))
  (prn (my-inc-fn 3)))
