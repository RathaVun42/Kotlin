fun displayMessage(): Unit{
    println("This function does not return any value")
}
fun add(): Int{
    val c = 10+20
    return c
}

fun main(){
    displayMessage()
    val result = add()
    println(result)
}