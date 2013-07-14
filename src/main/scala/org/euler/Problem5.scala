package org.euler

object Problem5 extends App {
	import math._
	
	val isDivisibleBy = (n: Int) => (_: Int) % n == 0
	val factorCandidates = (upTo: Int) => (2 until upTo)
	val isPrime = (n: Int) => factorCandidates(n).forall( y => !isDivisibleBy(y)(n))
	val primesUpTo = (limit: Int) => (1 to limit).filter(isPrime)
	
	def primeFactorsFor(n: Int): List[Int] = {
	
		def findFactor(number: Int, factors: List[Int]): List[Int] = {
			if (number == 1)
				factors
			else {
				val factorO = primesUpTo(n).filterNot( _ == 1).find(isDivisibleBy(_)(number))
				factorO match {
					case Some(factor) => findFactor(number/factor, factors :+ factor)
					case None => throw new RuntimeException("WTF")
				}
			}
		}
		
		findFactor(n, List[Int]())
	}                                         
	
	(11 to 20).map(primeFactorsFor(_))
	.map(_.groupBy(w => w).mapValues(_.size))
	.flatten
	.groupBy(w => w._1)
	.mapValues(_.maxBy(_._2)).values
	.foldLeft(1D)( (prod, it) => prod * pow(it._1.toDouble, it._2.toDouble)).toLong
  
}