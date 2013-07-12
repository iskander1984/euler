package org.euler

/*
 * Multiples of 3 and 5
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 */
object Problem2 extends App {
  import scalaz._
  import Scalaz._
  
  val isEven = (_: Int) % 2 == 0                  
	    
  unfold((0, 1)) { n =>
  	if (n._1 >= 4000000) none
  	else some( (n._1, (n._2, n._1 + n._2) )) }.filter(isEven).sum
}