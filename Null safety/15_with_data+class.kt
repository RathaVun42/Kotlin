data class User(val name: String, val age:Int)
fun main(){
    val user = User("Alice", 25)
    // access properties
    println(user.name)
    println(user.age)
    // auto-generated toString()
    println(user) // output: User(name= Alice, age= 25)
}