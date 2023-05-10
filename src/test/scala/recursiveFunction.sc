import scala.annotation.tailrec
def sumUntil(n: Int): Int = {
  if (n <= 0) 0
  else n + sumUntil(n - 1)
}

//sumUntil(5)

def calcFactorial(n: Int): Int = {
  if(n <= 1) 1
  else n * calcFactorial(n - 1)
}

//calcFactorial(3)

def newSumUntil(n: Int): Int = {

  @tailrec
  def loop(n: Int, acc: Int): Int ={
    if(n <= 0) acc
    else loop(n-1, n+acc)
  }
  loop(n, 0) //base case
}

//sumUntil(5)

//Return the sum of the numbers between two numbers a and b

def sumBetweenNumbers(a: Int, b: Int): Int = {
  if(a > b) 0
  else a + sumBetweenNumbers(a+1, b)
}

//sumBetweenNumbers(2, 5)
//sumBetweenNumbers(1, 5)

// -- solution 2 using tail recursive --
def sumNumbers(a: Int, b: Int): Int = {
  @tailrec
  def loop(x: Int, y: Int, acc: Int): Int = {
    if(x > y) acc
    else loop(x+1, y, acc + x)
  }
  loop(a, b, 0)
}

//sumNumbers(1, 5)

//Calculate the nth fibonacci number. Use the Fibonacci example
// to convince yourself only the tailrec solution is stack safe
//For fibonacci, we'd need: previous term, second previous term and next term

//Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

def fibonacci(n: Int): Long = {
  @tailrec
  def loopFibonacci(spTerm: Int, pTerm: Int, nextTerm: Int): Long = {
    if(nextTerm == n) pTerm + spTerm
    else loopFibonacci(pTerm, pTerm+spTerm, nextTerm + 1)
  }

  if(n == 1) 0L
  else if(n == 2) 1L
  else loopFibonacci(spTerm = 0, pTerm = 1, nextTerm = 3)
}

//fibonacci(1)
//fibonacci(2)
//fibonacci(3)
//fibonacci(4)
//fibonacci(7)
//fibonacci(8)
//fibonacci(9)
//fibonacci(13)
//fibonacci(25)
//fibonacci(6)

//a recursive function to check whether a number is prime
def isPrime(n: Int): Boolean = {
  @tailrec
  def checkPrimeNum(numChecker: Int): Boolean = {

  }
  if(n ==1 ) false
  else checkPrimeNum( numChecker = n)
}

//3%2 !=0  returns true
//3%1 != 0 false

isPrime(1)
isPrime(2)
isPrime(3)
//isPrime(4)
//isPrime(5)

//divide the number by 2 to the number-1
//else if number == divisor then true
//if number%divisor == 0 then false
// else perform function

//4













