fun main(){
    // safe calls (?.)
    data class Address(val city:String)
    data class Person(val address: Address?)
    val person = Person(Address(null))
    val city = person.address?.city
    println(city) // output null
}