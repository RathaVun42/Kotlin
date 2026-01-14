fun main(){
    val charArray = charArrayOf('A','B','C','D')
    // access and print elements
    println(charArray[1])
    // modify an element
    charArray[0] = 'Z'
    println(charArray.joinToString())
    // print all elements
    for (char in charArray){
        print("$char ")
    }
}