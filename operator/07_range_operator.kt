fun main(args: Array<String>) {
    // range using .. operator
    println()
    val range1 = 1..10 step 2
    println("Range1..10 step 2: $range1")
    for (i in range1) {
        print("$i ") // Output: 1 3 5 7 9
    }
    println()
    // character range
    val charRange = 'a'..'z'
    println("Char range a..e: $charRange")
    for (c in charRange) {
        print("$c ") 
    }
}