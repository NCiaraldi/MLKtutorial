(require
  '[datomic.api :as d]
  '[datomic.samples.repl :as repl])

; define a counter using 'atom'




; increase the counter value




; define a counter and init its value to 0 so that it will return 0
; at first call




; define a watcher on an atom that executes a function every time the state of the atom changes




; define a validator over a counter that returns error when the value of the counter
; is not between -1 and 7




; given the following atom, define a function to increase
; its values by a given amount e.g
; (def foo (atom {:valueA 11
;                :valueB 10}))
(def foo (atom {:valueA 1
                :valueB 0}))



; increase by 1 valueA key of foo atom




; reset the atom to 0 for all of its key








