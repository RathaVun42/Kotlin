fun main(){
    val nullableList: List<String?> = listOf("1",null,"2")
    val numbers = nullableList.mapNotNull{it?.toInt()}
    println(numbers)
}