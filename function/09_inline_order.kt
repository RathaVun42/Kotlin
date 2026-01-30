fun main(){
    // inline function increases performance
    myInlineFunction{println("Inline function parameter executed")}
    //non-inline function for comparision
    myRegularFunction{println("Regular function parameter executed")}
}
inline fun myInlineFunction(operation: ()->Unit){
    println("I am an inline function - start")
    operation()
    println("I am an inline function - End")
}
//non-inline version for comparision
fun myRegularFunction(operation: ()->Unit){
    println("I am a regular function - Start")
    operation()
    println("I am a regular function - End")
}