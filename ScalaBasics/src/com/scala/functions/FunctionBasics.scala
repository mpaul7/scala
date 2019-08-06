package com.scala.functions

object FunctionBasics {
  def main(args : Array[String]){
    val result = myMax(2, 3)
    println("Result of myMAx function is : "  + result)
    
    println("Result of myAdd(2, 3) function is : "  + myAdd(2, 3))
  }
  
  
  //semicolon is optional
  //return type is not required.
  // last statement executed is returned by the function
  // curly braces for a single line function body is optional.
  
  def myMax (x :Int, y:Int):Int =if(x > y) x else y
  def myAdd (x :Int, y:Int):Int = x + y
  
}