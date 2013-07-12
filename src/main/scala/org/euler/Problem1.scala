package org.euler

object Problem1 extends Application {  
  val is3Mult = (_: Int) % 3 == 0           
  val is5Mult = (_: Int) % 5 == 0         
	
  val result = (1 until 1000).map { it: Int =>  (it, is3Mult(it) || is5Mult(it))}.filter { _._2 == true}.map( _._1).sum
  
  println(s"Result = $result")
}