fun main(){
    val doubleArray = doubleArrayOf(1.2,1.0,3.9,4.4)
    // access and print elements
    println("First element ${doubleArray[0]}")
    // modify an element
    doubleArray[0] = 5.5
    println(doubleArray.joinToString("-"))
    println("Sum : ${doubleArray.sum()}")
}