(defn fibn [x] 
  (if (< x 2 ) 
       x 
       (+ ( fibn (- x 1))  ( fibn (- x 2)))  ))
 


(defn fib-seq [x] 
  (lazy-seq  (cons (fibn x)  (fib-seq  ( inc x)) ) ) )

 (apply + (filter even?  (take-while #(> 4000000 %) (fib-seq 0))))

