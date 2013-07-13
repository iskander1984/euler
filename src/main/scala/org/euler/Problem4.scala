package org.euler

object Problem4 extends App {
	import math._
	
	val isPalindrome = (n: Int) => n.toString == n.toString.reverse                       
	
	val candidates = for {
		i <-(100 to 999)
		j <-(100 to 999)
	} yield i*j                               
	
	candidates.filter(isPalindrome(_)).max    
}