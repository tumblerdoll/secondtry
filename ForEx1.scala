// wap to print 1 to n
package scalaass.forexample
import scala.io.StdIn
object ForEx1
{
  def main(args :Array[String]):Unit={

    println("Enter the limit : ")
    var n=StdIn.readInt();

    for(i <- 1 to n)
      {
        println(i)
      }
  }

}
