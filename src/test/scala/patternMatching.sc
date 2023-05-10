val numTuple = (1,2)

val matchNumTuple = numTuple match{
  case (1,y) => s"the tuple has value $y"
  case (x,2) =>  s"The tuple has value $x"
  case (x,3) =>  s"The tuple has value $x"
  case _ => "Not found"
}

val numList = List(1,2,3,4)

//val matchList = numList match{
//
//}

//Guards
val myNumber = 25
val matchmyNumber = myNumber match{
  case x if x < 25 => "I have a number less than 25"
  case x if x == 25 => "I have a number 25"
  case _ => "I have a number greater than 25"
}