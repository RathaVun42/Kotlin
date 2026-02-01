open class Shape{
    open fun draw(){
        println("Drawing a shape.")
    }
}

class Circle: Shape{
    override fun draw(){
        println("Drawing a circle")
    }
}
class Rectangle: Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}
fun main(){
    val shapes: List<Shape> = listOf(Circle(), Rectangle())
    for (shape in shapes){
        shape.draw()
    }
}