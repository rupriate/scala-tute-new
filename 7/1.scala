import scala.util.Random

object q1 {
  def filterEvenNumbers(numbers:List[Int]):List[Int]={
    numbers.filter((_:Int)%2==0)
  }

  def generateRandomNumbers(n: Int, range: Int): List[Int] = {
    (1 to n).map(_ => Random.nextInt(range)).toList
  }

  def main(args: Array[String]): Unit = {
    val input = generateRandomNumbers(10, 100) 
    val output = filterEvenNumbers(input);
    println(s"Input: $input")
    println(s"Output: $output")
  }
}
