package com.github.bfrydrych.scala;
object Play {
	def factorial(n: Int): Int = {
	  if (n == 1) 1 else n * factorial(n - 1)
	 }
	
	def pascalTriangle(column: Int, row: Int): Int = {
	    if (row == 0 || row == 1) return 1
	    if (column == 0) return 1
	    if (column == row) return 1
	    pascalTriangle(column -1, row -1) + pascalTriangle(column, row -1)
	}
}