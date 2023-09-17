object second {
  val PatternMatching = (num: Int) => {
    if (num <= 0) "Negative or Zero";
    else if (num % 2 == 0) "Even";
    else "Odd"
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ");
    var input = scala.io.StdIn.readInt();
    println(PatternMatching(input));
  }
}