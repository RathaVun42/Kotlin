fun main(){
    val numbers = mutableSetOf(1,3,2)// mutable
    numbers.add(4)
    numbers.add(2) // duplicate, won't be added
    println(numbers)

}