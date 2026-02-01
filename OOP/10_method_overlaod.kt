class Summation{
    fun sum(a: Int, b: Int): Int{
        return a + b
    }
    fun sum(a: Int, b: Int, c: Int): Int{
        return a+ b+c
    }
}
fun main(){
    val mysum = Summation()
    println(mysum.sum(1,2))
    println(mysum.sum(1,3,4))
}