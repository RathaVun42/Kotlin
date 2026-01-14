fun main(args: Array<String>) {
    // Elvis operator (?:)
    val name: String? = null
    val displayName = name ?: "Guest"
    println("Display Name: $displayName") // Output: Display Name: Guest
    // not-null assertion operator (!!)
    val str: String? = "Kotlin"
    val length: Int = str!!.length
    println("length: $length")

    //Safe call operator (?.)
    val nullableStr: String? = null
    val nullableLength = nullableStr?.length
    println("Safe call result: $nullableLength")

}