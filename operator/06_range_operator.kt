fun main(args: Array<String>) {
   val range1 = 1..5 // Inclusive range from 1 to 5
   println("Range1: ${range1}")
    for (i in range1) {
        print("$i ") // Output: 1 2 3 4 5
    }
    println()
    val range2 = 1 until 5 // Exclusive range from 1 to 4
    println("Range2: ${range2}")
    for (i in range2) {
        print("$i ") // Output: 1 2 3 4
    }
    println()
    val range3 = 5 downTo 1 // Decreasing range from 5 to 1

    println("Range3: ${range3}")
    for (i in range3) {
        print("$i ") // Output: 5 4 3 2 1
    }
}