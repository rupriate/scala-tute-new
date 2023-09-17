object first {
  val calculate_Interest = (deposit: Double) => {
    if (deposit <= 20000) deposit * 0.02
    else if (deposit <= 200000) deposit * 0.04
    else if (deposit <= 2000000) deposit * 0.035
    else deposit * 0.065
  }

  def main(args: Array[String]): Unit = {
    print("Enter an amount : ");
    var amount = scala.io.StdIn.readInt();
    var interest = calculate_Interest(amount);
    println("Interest = " + "%.2f".format(interest));
  }
}
