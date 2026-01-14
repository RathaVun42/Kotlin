// class definition
class Person(val name: String, var age: Int){
    // Method inside the class
    fun greet(){
        println("Hello, my name is $name and i am $age years old")
    }
}
fun main(args:Array <String>){
    //creating an object of the Person class
    val person = Person("Alice", 30)
    person.greet() // call the greet method
}