object AnotherMain extends App{
  def myFunction(a: Int, b: Int) = a+ b

  //declaring anonymous funtions
  val f = (a: Int, b: Int) => a + b

  //--alternative way of declaring anonymous functions
  val f2: (Int, Int) => Int = (a: Int, b: Int) => {a + b} : Int


  //a funtion that takes an integer and another function as its parameters
  def myHigherOrderFunction(num: Int, func: Int => Int) = func(num)

  val anon1 = (num: Int) => num + 3
  val anon2 = (num: Int) => num * num


  println(myHigherOrderFunction(8, anon1))
  println(myHigherOrderFunction(10, anon2))


  //declaring a function literal
  println(myHigherOrderFunction(7, x => x - 4))


  //        --Alternative solution to creating a function literal--
  println(myHigherOrderFunction(5, _ - 3))


  //------JAVA Collections-----------
  //Tuples
  val myTuple = ("Hello", "Welcome", "Marie", 9)
  println(myTuple._1)


  val myArray = Array(1,2,3,4,5)
  println(myArray(0))
  myArray.foreach(println(_))

}

//functions as arguments in a function must have a return type

//function literal subtract 4 from parameter

//read on compose and andThen

//Traversal is internal: Traversable collection controls the iteration.
//Iterable is external: Iterable collections provides iteration based on a separate iterator object. With iterable the client controls the iteration 

//Read on the partition method