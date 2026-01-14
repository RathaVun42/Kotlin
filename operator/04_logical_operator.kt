fun main(){
    var a = 30
    var b = 20
    var result1 = (a > b) && (a > 25) // true
    println(result1)
    var result2 = ( a<b)||(a >25) // true
    println(result2)
    var result3 = !((a>b) && (a > 25) ) // false
    println(result3)
    var result4 = !result3 // true
    println(result4)

}