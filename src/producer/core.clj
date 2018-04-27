(ns producer.core)

(defmacro my-inc [x]
  `(my-inc* ~x))

;; Use directly, relying on require side-effect
(defmacro my-inc-direct [x]
  `(third.core/foo ~x))
