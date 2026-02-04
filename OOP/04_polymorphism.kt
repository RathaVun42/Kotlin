open class Shape{
    open fun draw(){
        println("Drawing a shape.")
    }
}

class Circle: Shape(){// when we extend a class we need to add parentheses for it because it has constructor
                        // eventough we didnt create constructor, it still has default one
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
    val shapes: List<Shape> = listOf(Circle(), Rectangle())// this mean it is a list of Shape
                                                           // that can hold the subclasses object
                                                           // and the name of class in the list
                                                           // mean that in that list will create obj 
                                                           // from the class name then store them as list of shape
                                                           
    for (shape in shapes){
        shape.draw() // this can call only functions that are existed in parents class
    }
}