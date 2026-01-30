fun <T> asResult(vararg arr : T): List<T>{
    val result = ArrayList<T>()
    for(t in arr){
        result.add(t)
    }
    return result
}

fun main(){
    val arr = arrayOf(1,2,3,4)
    println(asResult(*arr)) // use * to tell that it is an array that past for vararg parameter
}