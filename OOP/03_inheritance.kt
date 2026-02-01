open class Animal(val name: String){ // open to access extend or inheritance
    fun eat(){
        println("$name is eating.")
    }
}
class Dog(name: String) : Animal(name){
    fun bark(){
        println("$name is barking.")
    }
}

fun main(){
    val dog =Dog("Prius")
    dog.eat()
    dog.bark()
}