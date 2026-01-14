fun main(){
    val obj: Any = "Kotlin"
    if(obj is String){
        println(obj.length)
    }
    val number: Any = 123
    val castedNumber = number as Int //Explicit casting
    println(castedNumber)
}