fun main(){
    val numbers = listOf(1,2,3,4,5)
    val squares = numbers.map({item -> item*item})
    println(squares)
}