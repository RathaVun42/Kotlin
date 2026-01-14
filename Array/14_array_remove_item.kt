fun main(){
    var array = arrayOf(1,2,3,4,5)
    array = removeItem(array, 5)
    for (element in array){
        println(" $element")
    }
}

fun removeItem(array: Array<Int>, item: Int): Array<Int>{
    var mutableArray = array.toMutableList()
    mutableArray.remove(item)
    return mutableArray.toTypedArray()
}