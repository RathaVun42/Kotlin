fun main(){
    val fruits = arrayOf("Apple","Banana","Cherry")
    //check if "Banana" exists
    if(fruits.contains("Banana")){
        println("Banana exists in the array")
    }else{
        println("Banana does not exist in the array")
    }
    val numbers = arrayOf(1,2,3,4,5)
    // check if 3 exists
    if(numbers.contains(3)){
        println("3 exists in the array")
    }else{
        println("3 does not exist in the array")
    }
}