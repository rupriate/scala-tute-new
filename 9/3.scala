object q3 {

  class Account(val accountHolder: String, var balance: Double) {

    

    def deposit(amt: Double): Unit = {
      if (amt > 0) {balance += amt}
      else throw new IllegalArgumentException("Deposit amount must be positive.")
    }

    def withdraw(amt: Double): Unit = {
      if (amt > 0 && balance >= amt) {balance -= amt}
      else throw new IllegalArgumentException("Insufficient funds or invalid amount.")
    }

    def transfer(target: Account, amt: Double): Unit = {
      if (amt > 0 && balance >= amt) {
        this.withdraw(amt)
        target.deposit(amt)
      } else {
        throw new IllegalArgumentException("Transfer failed due to insufficient funds or invalid amount.")
      }
    }

    override def toString: String = f"Account Holder: $accountHolder, Balance: Rs.${balance}%.2f"
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account("Alice", 1000)
    val acc2 = new Account("Bob", 1500)

    List(acc1, acc2).foreach(println)

    acc1.transfer(acc2, 300)

    List(acc1, acc2).foreach(println)
  }
}
