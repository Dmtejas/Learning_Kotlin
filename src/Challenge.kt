fun main(args: Array<String>) {
    val obj = Account()
    while(true) {
        println("\n\n")
        println("**********Welcome to your bank***********")
        println("Choose the transaction : ")
        println("1.Deposit\n2.Withdraw\n3.Balance\n4.exit (1-4)")
        val choice: Int? = readlnOrNull()?.toIntOrNull()

        when(choice) {
            1 ->{
                println("Enter the amount to deposit: ")
                val amount: Int? = readlnOrNull()?.toIntOrNull();
                obj.deposit(amount)

            }
            2 -> {
                println("Enter the amount to withdraw: ")
                val withdraw: Int? = readlnOrNull()?.toIntOrNull()
                obj.withdraw(withdraw)

            }
            3 -> {
                println("The Balance : ${obj.calculateBalance()}")
            }
            4 -> {
                println("Exiting the app now")
                kotlin.system.exitProcess(0)
            }

        }

    }
}

class Account() {
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int?) {
        if(amount != null && amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited, You balance : ${this.balance}")

        } else {
            println("Cannot deposit the negative amount")
        }
    }

    fun withdraw(withdrawl: Int?) {
        val withdraw = withdrawl?: 0
        if((withdraw?:-1) < this.balance && (withdraw?:-1) > 0 ) {
            transactions.add(-withdraw)
            this.balance -= withdraw
            println("$withdraw withdraw. Balance is now ${this.balance}")
        } else {
            println("Not enough balance in the account")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for(transaction in transactions) {
            this.balance += transaction
        }
        return this.balance;
    }

    fun transactionHistory() {
        for(transaction in transactions) {
            println("Transaction history : ")
            println(transaction)
        }
    }
}