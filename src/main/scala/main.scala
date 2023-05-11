object Main{
  val monthList = new ScalaList
  def main(args: Array[String]): Unit = {
    println(monthList.firstHalfOfThYear)
    println(monthList.secondHalfOfTheYear)


    //To add 2 lists, use the ::: operator. The ::: is right associated. This operator is list specific. That is, it can't
    //be used in other collections
    val fullYear = monthList.firstHalfOfThYear ::: monthList.secondHalfOfTheYear
    println(fullYear)


    // --solution 2 --
    //The ++ operator is not list specific. Means, it can be used in othe scalar collections
    val monthsInAYear = monthList.firstHalfOfThYear ++ monthList.secondHalfOfTheYear
    println(monthsInAYear)

    println(monthsInAYear.head)
    println(monthsInAYear.tail)

    //using the foreach method to display each month in the year
    monthsInAYear.foreach(println)

    //using the yearSubstring method
    val yearSubstring = monthsInAYear.map(_.substring(0,3))
    println(yearSubstring)


    //merging/zipping two lists
    val mergeFullMonthWithSubstring = monthsInAYear.zip(yearSubstring)
    println(mergeFullMonthWithSubstring)

    //sorting a list of numbers
    val sortNumList = monthList.numList.sorted
    println(sortNumList)

    val reverseSorting = monthList.numList.sorted.reverse
    println(reverseSorting)


    //converting a list of numbers to array separating the items with comma(,)
    val listToArray = monthList.numList.toArray.mkString("", "," , "")
    println(listToArray)

    println(monthList.numList)
  }
}