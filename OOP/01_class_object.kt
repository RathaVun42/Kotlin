class Person(var name: String, var age: Int){
    fun introduce(){
        println("Hi, my name is $name and I am $age years old.")

    }
}

fun main(){
    val person = Person("Ratha", 19) // create an object
    person.introduce()
}