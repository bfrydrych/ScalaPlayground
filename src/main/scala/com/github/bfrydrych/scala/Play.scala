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
	
	def isParenthesisBalanced(chars: List[Char]): Boolean = {
	  def evaluate(chars: List[Char], openCount: Int): Int = {
		  if (chars.isEmpty) return openCount
		  val head = chars.head
		  var count = openCount
		  if (head == '(') count += 1
		  if (head == ')' && count == 0) return -1 
		  if (head == ')')  count -= 1
		  evaluate(chars.tail, count)
	  }
	  val openCount = evaluate(chars, 0)
	  return openCount == 0
	}
}