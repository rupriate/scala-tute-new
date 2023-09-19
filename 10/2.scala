object q2 {
  
  def countLetterOccurrences(words: List[String]): Int = {
    val w_Lengths = words.map(_.length)
    val totalLetterOccurrences = w_Lengths.reduce(_ + _)

    totalLetterOccurrences
  }


    def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val t_Count = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $t_Count")
  }
}