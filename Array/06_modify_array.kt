fun main(){
    val colors = arrayOf("Red","Green","Blue")
    colors[0] = "Blue"
    colors[1] = "Red"
    colors[2] = "Yellow"

    println(colors.joinToString())
}