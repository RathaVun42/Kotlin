fun main(){
    val fruits1 = arrayOf("Apple","Mango","Banana","Orange")
    val fruits2 = arrayOf<String>("Apple","Mango","Orange")
    println(fruits1[0])
    println(fruits2[0])

    val names = arrayOf("Alice","Bob","Charlie")
    for (name in names){
        println(name)
    }
    // modify an element
    names[1] = "Brian"
    println("Modified arrya: ${names.joinToString()}")
}