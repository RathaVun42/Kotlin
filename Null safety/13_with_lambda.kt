fun main(){
    val nullableName: String? = "Kotlin"
    nullableName?.let{nonNullName -> println("Length of $nonNullName is ${nonNullName.length}")}
}