fun main(){
    val arr = arrayOf("A","B","C")
    for (index in arr.indices){
        //similar to for (int i = 0; i < arr.length; i++)
        println("Index: $index, Value: ${arr[index]}")
    }
}