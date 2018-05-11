(ns consumer.core
  (:require [producer.core :as producer]))

(defn -main [& args]
  (prn (producer/reverse-lookup (zipmap "123" "abc") \b))
  (prn (producer/reverse-lookup (zipmap "123" "abc") nil))
  (prn (producer/reverse-lookup' (zipmap "123" "abc") \b))
  (prn (producer/reverse-lookup' (zipmap "123" "abc") nil)))
