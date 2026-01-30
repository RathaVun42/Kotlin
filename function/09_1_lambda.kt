fun <T> execute(operation: (T) -> T, value: T): T {
    return operation(value)
}

fun main(){
        println(execute({ it * 2 }, 10))    // Int
        println(execute({it -> it*2}, 10)) // the same thing for lambda function that has parameter
        // execute({ it.uppercase() }, "hi")
}