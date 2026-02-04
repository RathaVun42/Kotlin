fun main(){
    val numbers = listOf(1,2,3,4)
    for(number in numbers){
        println(number)// output : 1,2,3,4
    }
    numbers.forEach({it->println(it)})
}