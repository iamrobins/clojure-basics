(ns hello-world.higher-order-functions)
;; higher order functions
;; It takes a function as an argument and returns a brand new function
;; The big three are map, filter and reduce
;; All other functions that do the same thing are based on these three

(map inc [ 1 2 3 4 5]) ;; The first argument is any arbiterary function, its inc here
;; the function that is passed in is referred to as predicate function. you could define your own function here.

(map (fn [n] (* 3 n)) [1 2 3 4 5])

;; There is also a shorthand way of creating this (lambda or anynomous) function.

(map # (* 3 %) [1 2 3 4 5])

;; It is the shorthand version and the % sign is the arguments that we've passed in.

(filter
 even?
 [1 2 3 4 5])

(filter
 #(= 3 %)
 [1 2 3 4 5])

;; Reduce

(reduce 
 (fn [acc curr]
   (assoc acc curr curr))
 {}
 [1 2 3 4 5])

;; higher order functions when they return a new value, it uses closures for that

(defn sum-with [x]
  (fn [y]
    (+ x y)))

(def add-to-3 
  (sum-with 3)) ;; (sum-with-3 y) => 3 + y

(add-to-3 4)

;; We can use it raw too.
((sum-with 5) 6)
