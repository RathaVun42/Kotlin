abstract class Vehicle{
    abstract fun drive()
}
// abstract class cannot create object(instantiated)
// contain abstract and simple function
// for the abstract function is required override in subclass
class Car : Vehicle(){
    override fun drive(){
        println("Driving a car.")
    }
}

class Bus : Vehicle(){
    override fun drive(){
        println("Driving a bus.")
    }
}

fun main(){
    val car = Car()
    car.drive()
    val bus = Bus()
    bus.drive()
}