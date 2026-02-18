fun main(){
    // elvis operator (?:) means if null, return the value (default value)
    val nullableName: String? = null
    val length = nullableName?.length ?: 0
    println(length)
}