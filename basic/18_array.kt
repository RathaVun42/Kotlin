fun main(){
    val numbers = arrayOf(1,2,3,4,5)
    println(numbers[2])// Access element at index 2
    numbers[2]=10 // modify element
    println(numbers.joinToString("-"))// output 1, 2, 10, 4, 5
}
