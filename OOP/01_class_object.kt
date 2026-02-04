class Person(var name: String, var age: Int){ // normally class dont have parentheses
                                              // but in this case parentheses is constructor
    fun introduce(){
        println("Hi, my name is $name and I am $age years old.")

    }
}

fun main(){
    val person = Person("Ratha", 19) // create an object
    person.introduce()
}