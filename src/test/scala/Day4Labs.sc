import scala.annotation.tailrec

//creating a sequence
val seq1 = Seq(5, 6, 11, 3, 19, 15)

val eachElement = seq1.foreach(println(_))
println(eachElement)

//creating an array
val arr1 = Array(11, 5, 17, 24, 2, 9)
val eachArrayElem = arr1.foreach(println(_))

println(eachArrayElem)

println(arr1.contains(15))

val appendNum: Array[Int] = arr1 :+ 12
println(appendNum.mkString("",",",""))

val prepend = 1 +: arr1
println(prepend.mkString("", ",",""))


//working with Lists
val stringList = List("Steve", "Tom", "John", "Bob")
val sortStringList = stringList.sortWith(_.compareTo(_) < 0)

println(sortStringList)

val reverseSortStringList = stringList.sortWith(_.compareTo(_) < 0).reverse
println(reverseSortStringList)


//Dealing with sets
val setNum = Set(1, 6, 4, 9, 15)
println(setNum & Set(3, 15, 2)) //intersection

println(setNum | Set(3, 5, 15))
//val liat = 2 :: 3 :: 4 :: List.empty
println(setNum &~ Set(3, 15, 2))


//Labs  --Qn1--

//using immutable sequence
def remove(coll: Seq[Int], idx: Int): Seq[Int] = {
  assert(coll.length > idx && idx >=0)
  val(left, _ :: right) = coll.splitAt(idx): @unchecked
  left ++ right
}


val numSequence = Seq(1, 6, 8, 9, 3, 17, 24)
println(remove(numSequence, 3))
println(remove(numSequence, 5))


//      -- Qn 2 --
@tailrec
def stakeLottery(listNum: List[Int], rand: scala.util.Random): List[Int] = {
    if(listNum.length == 6) listNum
    else stakeLottery(rand.nextInt(50) :: listNum, rand)
}


val randNumList: List[Int] = List.empty
def randNum = scala.util.Random

stakeLottery(randNumList, randNum)






