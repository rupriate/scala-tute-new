object q1 {

  def calculateAverage(temperatures: List[Double]): Double = {
    val F_Temp = temperatures.map(_ * 9/5 + 32)
    val total = F_Temp.reduce(_ + _)
    val avg = total / temperatures.length
    avg
  }


  def main(args: Array[String]): Unit = {
    val C_Temp = List(0.0, 10.0, 20.0, 30.0)
    val average_F = calculateAverage(C_Temp)
    println(s"Average Fahrenheit Temperature: $average_F")
  }

  
}
