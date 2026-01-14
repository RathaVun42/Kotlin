fun main(){
    var myarray = arrayOf(1,2,3,4,5)
    myarray = addElement(myarray,10)
    println("Elements in array: ")
    for(element in myarray){
        print(" $element")
    }
    println("")


}
fun addElement(myarray: Array<Int>, item: Int): Array<Int>{
    val mutableArray = myarray.toMutableList()
    mutableArray.add(item)
    return mutableArray.toTypedArray()
}