object first {
  def main(args: Array[String]): Unit = {
    val C_Temp = List(0.0, 10.0, 20.0, 30.0, 40.0)
    val average_F = cal_Avg(C_Temp)
    println(s"Average Fahrenheit Temperature: $average_F")
  }

  def cal_Avg(tempList: List[Double]): Double = {

    val F_Temp = tempList.map(celsius => (celsius * 9 / 5) + 32)
    println(F_Temp)
    val result = F_Temp.reduce((_ + _))
    val avg = result / tempList.length.toDouble
    avg
  }
}
