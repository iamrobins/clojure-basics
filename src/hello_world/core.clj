(ns hello-world.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(+ 1 1)

(defn say-hi [name]
  (str "Hi", name))
