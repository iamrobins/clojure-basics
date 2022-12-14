(ns hello-world.hash-map)
(hash-map "a" 1
          "b" 2)

(def temp-map
  {"a", 1, "b", 2})

temp-map

;; hash maps are useful because we can have more complicated data structures now
(def temp-map2
  {"hello" [1 2 {"hi" "bye" "age" 10}]})

temp-map2

;; In clojure we dont use strings as the keys instead we use keywords.
;; keywords start with : and then any key after that. for example :name
;; but keywords don't always have to be the key then can also be the value

(def some-map
  {:strings [1 2 {"a" 'b}]
   :some-key :same-val
   :nested-thing {:another-key "value"}})

some-map

;; Functions we use with maps

;; get
(get some-map :nested-thing)
(get (get some-map :nested-thing) :another-key)
;; another way of writing the same above nested expression
(get-in some-map [:nested-thing :another-key])

;; mutations
(assoc some-map :a-new-key "a-new-val")
(assoc-in some-map [:nested-thing :a-new-key] "a-new-val")
(dissoc some-map :nested-thing)

;; Functional programming works on the principles of immutablity thats why we return a new value
;; In clojure we've referential transparency, here we are not pointing to the memoery address like in traditional programming
;; but we point to the value so it will return false if we change something

(def my-map
  {:key1 "a"
   "key2" "b"
   :key3 'c})

my-map

(= my-map
  {:key1 "a"
   "key2" "b"
   :key3 'c})

;; another example of same is
(= 2 2)
(= 2 3)

;; This is the benefit of functional programming
;; These variables dont change with a operation so in your brain you can substitue it with the value that they are holding