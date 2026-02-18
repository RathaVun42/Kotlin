fun main(){
    // safe cast (as?) mean if cast fails, return null
    val obj: Any = "Kotlin"
    val str: String? = obj as? String // successful cast
    val num: Int? = obj as? Int // Fails, returns null
    println(str)
    println(num)
}