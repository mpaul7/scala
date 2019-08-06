package com.scala.functions

object PlaceholderSyntax {
  def main(args: Array[String]){
    
    val r = 1 to 10;
    println("values of r : " + r )
    
    val result1 = r.map(x => x + 10)
    println("result1 : " + result1)
    
     val result2 = r.reduce((x,y) => x + y)
     println("result2 : " + result2)
     
     val result3= r.reduce((x,y) => x * y)
     println("result3 : " + result3)
     
     val result4= r.reduce((x,y) => x max y)
     println("result4 : " + result4)
     
     /*
      * Scala already knows that the reduce method takes a function with two arguments. 
      * Why can't we remove the argument list from there? 
      * Why do I still need to code it? That's where the placeholder syntax is useful. 
      */
     
      val result5= r.reduce(_ + _)
     println("result5 : " + result5)
    
     val result6= r.reduce(_ * _)
     println("result6 : " + result6)
     
      val result7 = r.filter(_ > 5)
     println("result7 : " + result7)
  }
  
}