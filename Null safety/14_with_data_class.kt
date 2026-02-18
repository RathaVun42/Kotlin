data class User(val name: String?, val age: Int?)
fun main(){
    val user = User(null, 25)
    val displayName = user.name ?: "Unknown"
    println("Name: $displayName, Age: ${user.age?:"N?A"}")
}