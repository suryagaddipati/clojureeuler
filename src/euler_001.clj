(ns euler-001)

(defn div-by? [x ,y] (= (mod x  y)0)  )

(apply +  
  (filter 
    #(or (div-by? % 5 )  (div-by? % 3 ) )
    (range 1 1000)))
