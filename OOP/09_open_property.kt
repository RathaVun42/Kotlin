open class Animal{
    open val sound: String = "Some sound"
}
class Dog: Animal(){
    override val sound = "Bark"
}
fun main(){
    val animal: Animal = Dog()
    println(animal.sound)
}