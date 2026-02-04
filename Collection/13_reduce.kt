fun main(){
    val numbers = listOf(1,2,3,4)
    val sum = numbers.reduce({a,b -> a+b})
    println(sum) // output 10
}