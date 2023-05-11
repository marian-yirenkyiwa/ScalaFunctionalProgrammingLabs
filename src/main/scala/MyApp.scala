import scala.io.Source
import java.time.LocalTime
import scala.language.postfixOps
object MyApp extends App{
  val source = io.Source.fromFile("src/main/scala/Trades.txt")
//  val duration = 37200003
//  val time: LocalTime = LocalTime.ofNanoOfDay(duration * 1000000)
  for (record <- source.getLines) {
    val fields = record.split(",").map(_.trim)
    val trade = Tuple(fields.mkString("", ", ", ""))
//    println(s"${fields(0)}\t${fields(3)}\t${fields(4)}")
    println(trade)
  }
  source.close


}
