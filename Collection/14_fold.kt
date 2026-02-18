fun main(){
    val numbers = listOf(1,2,3,4)
    //val product = numbers.fold(3){a, b -> a*b} // the value in (3) will be timed at the end of process
    //val product = numbers.reduce({a,b -> a*b}) // the same output
    //val product = numbers.fold(2){a,b -> a + b} // it will plus (2) at the end of process
    val product = numbers.fold(2){a,b -> a - b} // it will minus (2) at the end of process
    println(product)
}