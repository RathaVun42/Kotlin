fun main(){
    greetWithDefault() // this will use default name we set in function
    greetWithDefault("Ratha")
}

fun greetWithDefault(name: String = "Unknown"){
    println("Hello $name")
}