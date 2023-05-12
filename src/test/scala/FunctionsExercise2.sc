//    -- Q2--
//Write a function that takes an int int as an argument and returns
//another function as a result
def returnNum(num: Int): String => Unit ={
  (getNumInSentence: String) => println(s"$getNumInSentence $num")
}

val sentence = returnNum(8)
sentence("The number you entered is")



//    --Q3
//val function: (String, (Int,(String=>Int))=>Int)=>(Int=>Int)




//      --Q4 --
//Currying - the process of converting a function with multiple arguments into
// a sequence of functions that take one argument. Each function returns another
// function that consumes the following argument

//Without currying
def addThreeNumbers (x: Int, y: Int, z: Int) = x + y + z
val addNum = addThreeNumbers(5, 9, 12)
println(addNum)

//With currying
val sumOfThreeNumbers: (Int, Int, Int) => Int = (x, y, z) => x + y + z
val curriedSumOfThree: Int => Int => Int => Int = x => y => z => x + y + z

println(curriedSumOfThree(5)(9)(12))
