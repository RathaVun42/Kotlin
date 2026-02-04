fun main(){
    val numbers = listOf(1,2,3,4)
    val product = numbers.fold(1){a, b -> a*b}
    //val product = numbers.reduce({a,b -> a*b}) // the same output
    println(product)
}