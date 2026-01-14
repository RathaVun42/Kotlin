fun main(args: Array<String>) {
    val a = "Kotlin"
    val b = "Kotlin"
    val c = a
    println(a === b) // Output: true (get from the string pool)
    println(a === c) // Output: true (same reference)
    println(a == b) // Output: true (same value)

    val d = String("Kotlin".toCharArray())
    val e = String("Kotlin".toCharArray())
    if( d is String){
        println("$d is a String")
    }else{
        println("$d is not a String")
    }
    println(d === e) // now this would be false
                    // eventhoght they have same value but different reference because theyt are made by different objects
    println(d == e) // this will be true because they have same value
    
}