fun main(){
    val name: String? = "Kotlin"
    // name?.let{
    //     println("The name is $it") // output: the name is kotlin
    // }
    name?.let({it -> println("The name is $it")})
    val nullName: String? = null
    nullName?.let{
        println("This wont be printed")
    }
}