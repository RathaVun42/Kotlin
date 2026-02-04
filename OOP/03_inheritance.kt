open class Animal(val name: String){ // open to access extend or inheritance
    fun eat(){
        println("$name is eating.")
    }
}
class Dog(name: String) : Animal(name){ // the name here just a parameter use as argument for parent class
                                        // Animal(name) : name here is the parameter in class dog, it will send data to parent class
                                        // we also can create more properties for Dog class{Dog(name: String, var age: Int, ...)}
    fun bark(){
        println("$name is barking.")
    }
}

fun main(){
    val dog =Dog("Prius")
    dog.eat()
    dog.bark()
}