fun main(){
    val fruits = arrayOf<String>("Apple","Mango","Banana")
    if("Mango" in fruits){
        println("Mango exists in fruits")
    }else{
        println("Mango does not exist in fruits")
    }

    val numbers = arrayOf(1,2,3,4,5)
    if(10 in numbers){
        println("10 exists in numbers")
    }else{
        println("10 does not exist in numbers")
    }
}