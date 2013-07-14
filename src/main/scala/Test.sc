object Test {
	
	import math._
	
	val diff = (n: Int) => ((3*pow(n, 2) + 2*n) * (1 - pow(n, 2)) / 12)
                                                  //> diff  : Int => Double = <function1>
	diff(100)                                 //> res0: Double = -2.516415E7
		
}