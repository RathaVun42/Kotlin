fun main(){
    val words = listOf("apple","banana","apricot", "blueberry")
    // group words by their first letter
    val grouped = words.groupBy({it -> it.first()})
    println(grouped)
}