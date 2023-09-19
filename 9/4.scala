object q4 {

  class Account(val accountHolder: String, var balance: Double) {

    

    def deposit(amt: Double): Unit = {
      if (amt > 0) {balance += amt}
      // else throw new IllegalArgumentException("Deposit amount must be positive.")
    }

    def withdraw(amt: Double): Unit = {
      if (amt > 0 && balance >= amt) {balance -= amt}
      // else throw new IllegalArgumentException("Insufficient funds or invalid amount.")
    }

    def transfer(target: Account, amt: Double): Unit = {
      if (amt > 0 && balance >= amt) {
        this.withdraw(amt)
        target.deposit(amt)
      } else {
        // throw new IllegalArgumentException("Transfer failed due to insufficient funds or invalid amount.")
      }
    }

    override def toString: String = f"Account Holder: $accountHolder, Balance: Rs.${balance}%.2f"
  }


  class Bank(val accounts: List[Account]) {

    def getNegetiveAccounts(): List[Account] = accounts.filter(_.balance < 0)

    def getTotalBalance(): Double = accounts.map(_.balance).sum

    def depositeInterest(): Unit = {
      accounts.foreach(account => {
        if (account.balance > 0) {
          account.deposit(account.balance * 0.05)
        } else {
          account.withdraw(account.balance * 0.1)
        }
      })
    }
  }


  def main(args: Array[String]): Unit = {

    val account1 = new Account("Alice", 1000)
    val account2 = new Account("Bob", -500)
    val account3 = new Account("Charlie", 2000)

    val bank = new Bank(List(account1, account2, account3))

    val negetiveAccounts = bank.getNegetiveAccounts()
    println("\nAccounts with negative balances:")
    negetiveAccounts.foreach(println)

    val totalBalance = bank.getTotalBalance()
    println(s"\nTotal balance of all accounts: $totalBalance")

    bank.depositeInterest()

    println("\nFinal balances after applying interest:")
    bank.accounts.foreach(println)

  }

}
