fun main(){
    val value: Any = 42
    when(value){
        is Int -> println("It's an integer.")
        is String -> println("It's a string.")
        in 1..50 -> println("It''s within range 1-50.")
        else -> println("Unknown type")
    }
}