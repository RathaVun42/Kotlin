fun main(){
    val number = 5
    val result = when (number){
        1 -> "One"
        2,3,4 -> "A few" // Multiple conditions
        in 5..10 -> "Many" // Range condition
        else -> "Unknown"
    }
    println(result)
}