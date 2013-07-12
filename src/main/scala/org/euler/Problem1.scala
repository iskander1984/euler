package org.euler

/* 
 * Even Fibonacci numbers
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */

object Problem1 extends App {  
  val is3Mult = (_: Int) % 3 == 0           
  val is5Mult = (_: Int) % 5 == 0         
	
  val result = (1 until 1000).map { it: Int =>  (it, is3Mult(it) || is5Mult(it))}.filter { _._2 == true}.map( _._1).sum
  
  println(s"Result = $result")
}