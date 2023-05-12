import scala.annotation.tailrec
import scala.collection.immutable.ListMap

// Write a method that can determine whether a string is made up from unique
//characters. Optional, write a version that doesn’t use addi+onal data structures)

//    -- Q3
def uniqueCharacters(word: String): Boolean =  word.toLowerCase.length.equals(word.toSet.size)

println(uniqueCharacters("Marian"))
println(uniqueCharacters("Marin"))


//TODO Get the length of the String
  //Convert to a set
  //Check if the length of the set == length of the String



  //    -- Q2
  // Write a method that returns true if a string is a palindrome ( a word, phrase or
//sequence that reads the same backwards as forwards – i.e. madam or nurses run)

def isPalindrome(phrase: String): Boolean = {
  val phraseWithoutSpace = phrase.toLowerCase().replaceAll(" ", "")
  phraseWithoutSpace == phraseWithoutSpace.reverse
}

println(isPalindrome("madam"))
println(isPalindrome("Gideon"))
println(isPalindrome("nurses run"))
println(isPalindrome("Nurses Run"))



//    -- Q1 --
// Given a list of words (strings) return the 3 most common and the 3 least common
//words. Optional, read the words from a file

def wordFrequency(wordList: List[String]): Map[String, List[Tuple]] = {
  val groupedWordMap = wordList.groupBy(x => x).transform((_, x) => x.size)
  val sortedWordList = groupedWordMap.toList.sortBy(_._2)
  val leastCommonWords = sortedWordList.take(3)
  val mostCommonWords = sortedWordList.takeRight(3).reverse

  Map("Least Common Words" -> leastCommonWords, "Most Common Words" -> mostCommonWords)


}

wordFrequency(List("Hi", "Hello", "Bye", "Hi", "Hi", "Bye", "Welcome", "Marian", "Gideon", "Turntabl", "Gideon", "Welcome", "Bye", "Bye"))


//Day 4
//    -- Q1 --
//Given a list of Strings containing groups of numbers separated by empty
//strings find the value of the highest valued group. eg: {"1", "2", "", "40","2","",
//"4"} = three groups with values 3, 42 and 4. Highest value is 42.

def highestValuedGroup(groupedValues: List[String]): Int = {
  @tailrec
  def loop(listOfNumbers: List[Int], acc: Int, index: Int): Int = {
    val currentString = groupedValues(index)
    if(index == groupedValues.size-1) {
      val currentStringChecked = if currentString == "" then 0 else currentString.toInt
      val currentSum = acc + currentStringChecked
      val updatedList: List[Int] = listOfNumbers :+ currentSum
      updatedList.max
    }

    else if(currentString == "") {
      val updatedList: List[Int] = listOfNumbers :+ acc
      loop(updatedList, 0, index+1)
    }
    else {
      val currentSum = acc + currentString.toInt
      loop(listOfNumbers, acc  =currentSum, index+1)
    }
  }
  loop(listOfNumbers = List.empty, 0, 0)
}

println(highestValuedGroup(List("1", "2", "", "40", "2", "", "400", "")))

//TO DO
// -> We will loop through the list and sum the values
//->When an empty string is encountered, calculate the sum of the strings cast into an int
//and store it in another list
//->Return the highest sum value from the list






//foldLeft method on list


//    -- Q2 --
// Money objects should be immutable. Create methods for
//adding/subtracting/dividing/multiplying two money objects. (How should you
//deal with different currencies?)
//• Money objects should be ordered by currency name (alphabetic order) and
//then value. Update the money class


