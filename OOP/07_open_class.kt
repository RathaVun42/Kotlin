open class Vehicle{
    fun startEngine(){
        println("Engine started.")
    }
}

class Car : Vehicle(){
    fun drive(){
        println("Driving the car.")
    }
}
fun main(){
    val car = Car()
    car.startEngine()
    car.drive()
}