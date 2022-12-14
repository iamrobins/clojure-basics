(ns hello-world.functions)
;; functions are just values so we can assing them to variables too.

;; anynomous function
(fn [a b]
  (+ a b))
;; anonymous function assinged as a value
(def add-2
  (fn [a b]
    (print a b "\n")
    (+ a b)))

(add-2 10 10)

;; We've written the above code just to prove that in clojure functions are values
;; There's a shorthand for doing the same

(defn add-3
  "Add three numbers together"
  [a b c]
  (println a b c)
  (+ a b c))

(add-3 10 20 30)

;; To create add func with multiple args we've two ways
;; Method 1

(defn add-more-1
  ([a b]
   (+ a b))
  ([a b c]
   (+ a b c)))

(add-more-1 10 20)
(add-more-1 10 20 30)

;; Method 2

(defn add-more-2
  [& x]
  x)

(add-more-2 10 20)
(add-more-2 10 20 30 40 50)

;; Closure
;; The bindings exists only within the function so its a scope feature
;; def is a global scope
;; (def a a) inside a defn is a bad practice because its a inline def 

(defn add-3
  [a b c]
  (let [d (+ a b c)] ;; d is our new var that we're creating
    d))

;; The way let works is you provide it a vector much like a func argument list except its inside of a pair so you can think of it as tuple
;; where the left side is identifier the symbol that u want to call it by and the right side is the actual value that you want to put inside.

(add-3 10 20 30)

;; If I try to access var "d" it will give error as its not inside global namespace because it only exists inside of the let binding.
;; Also let binding doesn't necessarily have to be in a function
;; Usually you will not see a let binding outside of a function unless you're playing with the REPL.

(let [a (+ 3 3)
      b (* 10 10)]
  (+ a b))


;; Function Conventions

'valid? ;; boolean functions
(even? 3)

's->t ;; transformation functions
(defn list->set [l]
  (set l))
(list->set [1 2 2 3])

'mutable! ;; non-pure functions with side effects things that're stateful, that changes something in the system or even outside the system.

'end-with-star* ;; up to the library maintainers

(defn is-sum-even? [a b]
  (if (even? (+ a b))
    (+ a b)
    "Not even"))

(is-sum-even? 5 2)

;; Same function with when, it is used when we don't care about the false case

(defn is-sum-odd? [a b]
  (when (odd? (+ a b))
    (+ a b)))

(is-sum-odd? 10 21)

;; loops
;; We do loops using recursion, because for and while loops depends upon mutation and we're not about mutations so we gonna use recursion.

(defn factorial [n]
  (if (> n 1)
    (* n (factorial(dec n)))
    1))

(factorial 8)