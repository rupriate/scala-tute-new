object Caesarcipher {
  
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = ((char - base + shift) % 26 + base).toChar
        if (shiftedChar < base) (shiftedChar + 26).toChar else shiftedChar
      } else {
        char
      }
    }
  }


  def decrypt(text: String, shift: Int): String = {
    encrypt(text, -shift)
  }


  def main(args: Array[String]): Unit = {
    println("Enter a String :")
    var str=scala.io.StdIn.readLine()

    println("Enter the shift: ")
    var shift=scala.io.StdIn.readInt()


    val eText = encrypt(str, shift)
    print("Encrypted: " + eText+"\n")



    val dText = decrypt(eText, shift)
    println("Decrypted: " + dText+"\n")
  }
}
