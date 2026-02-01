class BankAccount(private var balance: Double){
    fun deposit(amount: Double){
        if(amount > 0) balance+= amount
    }
    fun withdraw(amount: Double){
        if(amount>0 && amount<=balance){
            balance -= amount
        }
    }
    fun getBalance(): Double{
        return balance
    }
}
fun main(){
    val account = BankAccount(5000.0)
    account.deposit(1000.0)
    account.withdraw(6000.0)
    println("Balance: ${account.getBalance()}")
}