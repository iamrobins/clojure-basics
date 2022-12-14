(ns hello-world.vector-and-list)
;; Vector is the main list type inside clojure
;; Its dynamic we can hold strings and characters

(vector 1 2 3)

(def temp
  [1 2 3])

temp

(comment
  temp
  ;;
  )

;; lisp means list programming
;; Everything inside your program is a list
;; So the first thing is usually a function, followed by all the arguments
;; This leaves the giant meme inside clojure that everything is just data
;; even your code is data

(list 1 2 3 4)

'(1 2 3 4 5)

;; Most of the things vector and list can used interchangebly but here is the diff
;; Inside java they are both constructed as linked list
;; but is implemented as a stack and one is implemented as a queue

(def temp-vector
  (vector 1 2 3))

(def temp-list
  (list 1 2 3))

(conj temp-vector 10)
(conj temp-list 10)
;; This leads us to the concept of polymorphism inside clojure
;; even though they are two distinct types they are treated as the same for certain functions

(coll? temp-vector)
(coll? temp-list)

(seq? temp-list)
;; Vector is not seq but we can convert it to
(seq temp-vector)

;; Its not imp to understand coll or seq but all you need to know is these are intermediate types that allow functions to be called on any form of these things
;; example first we will get the first val for vector and list
(first temp-list)
(first temp-vector)
(second temp-list)

;; This type of polymorphism is really useful other we have to write like
;; (list-first) or (vector-first)
;; Actually it does exists in other language
;; In haskell there is fmap or mmap even though they are all implementing the map function just with diff types but in clojure you don't have to worry about that.
