object q1 {
  def calculateInterest(amount:Double):Double = {
    val interestFunction: (Double => Double) = 
      if (amount < 20000) (_:Double) * 0.02
      else if (amount < 200000) (_:Double) * 0.04
      else if (amount < 2000000) (_:Double) * 0.035
      else (_:Double) * 0.065
    
    interestFunction(amount) 
  }

  def main(args: Array[String]): Unit = {
    print("Enter an amount : ");
    var amount = scala.io.StdIn.readInt();
    var interest = calculateInterest(amount);
    println("Interest = " + "%.2f".format(interest));
  }
}
