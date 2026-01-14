fun main(){
    val booleanArray = booleanArrayOf(true,false,true,false)

    // access and print elements
    println("First elements : ${booleanArray[0]}")
    //modify an element 
    booleanArray[0] = false
    println(booleanArray.joinToString())
    // count true value

    println("Number of true values: ${booleanArray.count{it}}")
}