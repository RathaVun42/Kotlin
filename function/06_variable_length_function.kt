fun main(){
        var array1 = arrayOf(1,32,3,22,3) //is a boxed array (Array<Int>), not an IntArray
        var array = intArrayOf(33,45,55,43) // this is primative arrya that can be used with varargd parameter
        printNumbers(*array,2,3,2,3)
        
}

fun printNumbers(vararg numbers: Int){ // compiled as an IntArray (primative array)
    for(num in numbers){
        println(num)
    }
}