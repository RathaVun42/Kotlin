fun main(){
    val numbers = listOf(1,2,3,4,5)
    val evenNumbers = numbers.filter({item -> item%2 == 0})
    println(evenNumbers)
}