(ns hello-world.sets)
(set [1 2 3 3])

(def temp-set
  #{1 2 3})

temp-set
(coll? temp-set)
(first temp-set)
;; order will differ as its a set not a list
(second temp-set)