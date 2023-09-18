import scala.util.Random

object q2 {
  def calculateSquare(numbers:List[Int]):List[Int]={
    numbers.map((x:Int) => x*x)
  }

  def generateRandomNumbers(n: Int, range: Int): List[Int] = {
    (1 to n).map(_ => Random.nextInt(range)).toList
  }

  def main(args: Array[String]): Unit = {
    val input = generateRandomNumbers(10, 10) 
    val output = calculateSquare(input);
    println(s"Input: $input")
    println(s"Output: $output")
  }
}
