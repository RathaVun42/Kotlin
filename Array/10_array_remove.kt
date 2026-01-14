fun main(){
    val numbers =arrayOf(1,2,3,4)
    // remove an item
    val updatedNumbers = numbers.filter{ it != 3}.toTypedArray()
    println(numbers.joinToString())
    println(updatedNumbers.joinToString())

    val strings = arrayOf("A","B","C","D")
    val updatedStrings = strings.filter{it != "B"}.toTypedArray()
    println(strings.joinToString())
    println(updatedStrings.joinToString())
}