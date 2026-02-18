fun main(){
    // elvis operator (?:)
    val nullableName: String? = null
    val length = nullableName?.length ?: throw IllegalArgumentException("Name cannot be null") 
}