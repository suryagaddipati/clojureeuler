(ns euler-002)
(defn fibn [x] 
  (if (< x 2 ) 
       x 
       (+ ( fibn (- x 1))  ( fibn (- x 2)))  ))
 


( apply + (filter even?  
            ( map fibn    
              (take-while #(> 4000000   (fibn % ) )  (iterate inc 0)) ) ))


