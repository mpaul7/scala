package com.scala.functions

object FunctionLiterals {
   def main(args : Array[String]){
  
/*
 * We can assign functions to a value.
 * We can pass them as a parameter.
 * We can return them from a higher order function.
 */
     val f = (x:Int) => (x + 5)
     
     val result = f(5)
     
     println(" the result f(5) : " + result)
     
     // ==================================
     // Higher order function
     // map is a higher order function
     val data = List(-250, 75, 145, 222, -80, -140, 170, 85, 122, 250 )
    val result2 =  data.map((x:Int) => x + 10)
    // or we can write this as
     val result3 =  data.map(x => x + 10)
    
     println(result2)
     println(result3)
     
     val customers = List("alex", "Jhon", "bob")
     //(x:String) => x.capitalize
     val result4 = customers.map((x:String) => x.capitalize)
     println("Captalized List : "  + result4)
   }
}