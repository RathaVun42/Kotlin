fun main(){
    val fruits = mutableListOf("Apple","Banana","Cherry")
    // add an item 
    fruits.remove("Banana")
    println(fruits.joinToString())
    for( fruit in fruits){
        println(fruit)
    }

}