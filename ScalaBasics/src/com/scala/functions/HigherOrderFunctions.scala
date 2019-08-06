package com.scala.functions

object HigherOrderFunctions {
  def main(args : Array[String]){
    
    def sumX(x:Int, y:Int, f:(Int, Int) => Int) = f(x, y)
    
    val result1 = sumX(3, 5, (x, y) => x*x*x + y*y*y)
    
    println("result1 : " + result1)
    
     val result2 = sumX(3, 5, (x, y) => x + y)
    
    println("result2 : " + result2)
    
    //=========================================
    
    def greetSomeone(prefix: String) ={
      println("Got a prefix :" + prefix)
      (name:String) => println(prefix + " " + name)     
    }
    
    greetSomeone("mpaul")
    
    val hiSomeone = greetSomeone("Hello")
    println(hiSomeone)
    hiSomeone("mpaul")
    
    //Function Curry
    //calling functions in a series is popularly known as function currying
    greetSomeone("Hello")("mpaul")
    
    //=======================================
    
    val fs = (prefix:String) => { (s:String) => prefix + " " + s}
    println(fs("Hi") ("mpaul"))
    
    //=======================================
    
    def f2(x:Int) = {
      (y:Int) => Math.sqrt(x + y)
    }
    
    val result3 = f2(2)(2)
    println("result3 : " + result3)
  }
  
}