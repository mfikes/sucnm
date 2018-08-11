(ns lib.core)

(defmacro reverse-lookup [m v]
  `(when-some [v# ~v]
     (get (inverse* ~m) v#)))

(defmacro reverse-lookup' [m v]
  `(when-some [v# ~v]
     (get (clojure.set/map-invert ~m) v#)))
