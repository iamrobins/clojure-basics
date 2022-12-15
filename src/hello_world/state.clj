(ns hello-world.state)
;; When we want to keep track of state changes there are 3 different data types for dealing with state changes
;; atoms, ref, agent

(comment
  (def state (atom 10)) ;; What ever is inside the atom is the mutable value
  state ;; We get the value by evaluating the state, So its the value at the memory address we get in output.
  )

;; Two functions we need to know when dealing with atom "reset" and "swap"

(comment
  (def state (atom 10))
  state ;; same address
  (reset! state "Hello")
  state ;; same address
  (deref state) ;; to get the value only not the memory address. We're dereferencing the memory address.
  (let [] 
    @state) ;; shorthand way instead of using deref
  (swap! state assoc :new-kw "something new") ;; Swap for edit and update
  )