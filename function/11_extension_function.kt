fun String.addExclamation(): String{
    return this + "!"
}

fun Number.doubleValue(): Double{
    return this.toDouble()*2
}
fun main(){
    println("Hello".addExclamation())
    println(3.doubleValue())
}