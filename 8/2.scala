object q2 {
 def PatternMatching(num: Int): String = {
    val classifier: (Int => String) = 
      n => if (n <= 0) "Negative/Zero" else if (n % 2 == 0) "Even" else "Odd"
    
    classifier(num) 
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ");
    var input = scala.io.StdIn.readInt();
    println(PatternMatching(input));
  }
}