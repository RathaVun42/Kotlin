fun main(){
    // array of size 5, elements are 0,2,4,6,8
    val numbers = Array(6,({i -> i*2})) // or Array(6){i->i*2}
    val strings = Array(3){i -> "Item ${i + 1}"}
    // access and print elements

    println(numbers.joinToString())
    println(strings.joinToString())
}