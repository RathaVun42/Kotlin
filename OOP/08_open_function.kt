open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
class Circle: Shape(){
    override fun draw(){
        println("Drawing a circle.")
    }
}
 fun main() {
    val shape: Shape = Circle() // this is polymorphism and we declare Shape as reference for the shape obj
                                // even though we didnt declare shape datatype it still fine, the reference is circle itself
                                // and it is not polymorphism anymore
    shape.draw()
}