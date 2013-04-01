package com.github.bfrydrych.runners

import com.github.bfrydrych.scala.Play



object Runner {
	def main(args: Array[String]) {
	  printPascalTriangle
	}
	
	def printPascalTriangle = {
			println("Pascal's Triangle")
			for (row <- 0 to 10) {
				for (col <- 0 to row)
					print(Play.pascalTriangle(col, row) + " ")
					println()
			}
	  
	}
}