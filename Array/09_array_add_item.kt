fun main(){
    val  numbers = arrayOf(1,2,3)
    // add an item
    val newNumbers = numbers+ 4
    println(numbers.joinToString()) // 1,2,3
    println(newNumbers.joinToString())// 1 2 3 4
    val strings = arrayOf("A","B","C")
    val newStrings = strings + "D"
    println(strings.joinToString()) // A B C
    println(newStrings.joinToString()) // A,B,C,D

}