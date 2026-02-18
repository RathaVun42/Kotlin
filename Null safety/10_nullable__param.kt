fun greet(name: String?){
    println("Hello, ${name ?: "guest"}")
}
fun main(){
    greet("Kotlin")
    greet(null)
}