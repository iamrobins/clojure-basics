;; (ns hello-world.other.namespaces
;; (:require [hello-world.other.other-file])) ;; 1st type of import

;; (ns hello-world.other.namespaces
;; (:require [hello-world.other.other-file :as of])) ;; 2nd type of import

(ns hello-world.other.namespaces
  (:require [hello-world.other.other-file :refer [from-other-file]] ;; 3rd type
            [clojure.string :as s])
  (:import [java.util UUID]))


;; Namespace is basically a equivallent of a file name it's how closure seprates all of our code in a meaningful way.
;; We've to use _ in file names because they're read by java but inside the same file we can use - in its name because here it's read by clojure.

(defn -main []
  (println "Hello World from Namespace"))

(comment
;;   (hello-world.other.other-file/from-other-file) ;; 1st import use
;;   (of/from-other-file) ;; 2nd import used
  (from-other-file) ;; 3rd import use
  (s/join ["Hello" "World"])
  (UUID/randomUUID)
  )
