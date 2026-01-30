fun main(){
    myFunction({println("Inline function parameter")})
    val operation = getOperation()
    operation()
}

// higher order function
fun myFunction(operation: () -> Unit){
    println("I am inline function - A")
    operation()
    println("I am inline function - B")
}

// function that returns a function
fun getOperation(): () -> Unit{
    return {println("Returned function executed")}
}

