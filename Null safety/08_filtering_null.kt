fun main(){
    val nullableList: List<String?> = listOf("Kotlin",null,"Java")
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList)
}