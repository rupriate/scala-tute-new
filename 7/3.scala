object q3 {


  def isPrime(n:Int):Boolean={

    var primeFlag = true;

    if(n==1){
      primeFlag = false;
    }else{
      for(i <- 2 to (n-1)){
        if (n%i==0){
          primeFlag = false;
        }
      }
    }
    return primeFlag;
  }



  def filterPrime(numbers:List[Int]):List[Int]={
    numbers.filter(isPrime(_))
  }


  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val output = filterPrime(input);
    println(output);
  }

}