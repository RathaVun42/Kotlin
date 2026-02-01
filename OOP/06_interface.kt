interface Flyable{
    fun fly()
}
class Airplane : Flyable{
    override fun fly(){
        println("Flying an airplane.")
    }
}

fun main(){
    val airplane = Airplane()
    airplane.fly()
}