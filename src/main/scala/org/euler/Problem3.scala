package org.euler
/*
 * Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
object Problem3 extends App {
	import math._
	
	val isDivisibleBy = (n: BigInt) => (_: BigInt) % n == 0	                                              	
	val isDivisibleBy2or3 = (n: BigInt) => isDivisibleBy(2)(n) || isDivisibleBy(3)(n)	                                              		
	val factorCandidates = (upTo: BigInt) => (2 until upTo.toInt)  
	val isPrime = (n: BigInt) => factorCandidates(n).forall( y => !isDivisibleBy(y)(n))
                                                                                                   	
	(round(sqrt(600851475143D)) until 3 by -1)
	.filterNot { m => isDivisibleBy2or3(m)}
	.filter { n => isDivisibleBy(n)(BigInt("600851475143"))}
	.find(isPrime(_))                               
}