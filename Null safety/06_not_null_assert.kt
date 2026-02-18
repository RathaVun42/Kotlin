fun main(){
    // non-null assertion (!!) mean it is not null
    val name :String? = "Kotlin"
    println(name!!.length)
    val nullableName: String? = null
    println(nullableName!!.length) // Throws nullPointerException
}