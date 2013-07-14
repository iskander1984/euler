package org.euler

object Problem6 extends App {
	import math._
	
	val diff = (n: Int) => ((3*pow(n, 2) + 2*n) * (1 - pow(n, 2)) / 12)
	
	diff(100)                                
}