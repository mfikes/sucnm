(ns consumer.core
  (:require [producer.core :as producer]))

(defn -main [& args]
  (prn (producer/my-inc 3))
  (prn (producer/my-inc-direct 5)))
