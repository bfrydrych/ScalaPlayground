object playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	def factorial(n: Int, result: Int = 1, firstGo: Boolean = true): Int = {
	  if (n == 1) result
	  else {
	  	var partialResult = result
	  	if (firstGo) {
	  		partialResult = n
	  	}
	  	partialResult = partialResult * (n - 1)
	  		factorial(n - 1, partialResult, false)
	  		}
	 }                                        //> factorial: (n: Int, result: Int, firstGo: Boolean)Int
	
	
	factorial(5)                              //> res0: Int = 120

  
 
}