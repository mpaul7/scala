package com.scala.basic

object TypeBasics {
  def main(args : Array[String]){
    // Immutable variable
    val x :Int =123;
    println("The value of x : " + x);
    
    //Mutable variable
    var y :Int =123;
    println("The value of y : " + y);
    
    y = 456;
    println("The changed value of y : " + y);
    
  }
  
}