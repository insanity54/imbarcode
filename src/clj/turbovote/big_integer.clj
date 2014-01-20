(ns turbovote.big-integer
  (:refer-clojure :exclude [+ * inc quot rem int zero?]))

(defn valid-string? [string]
  (re-matches #"\A\d*\z" string))

(defn from-string
  ([string] (Integer/parseInt string))
  ([string radix] (Integer/parseInt string radix)))

(def + +')
(def * *')
(def inc clojure.core/inc)
(def quot clojure.core/quot)
(def rem clojure.core/rem)
(def int clojure.core/int)
(def zero? clojure.core/zero?)
