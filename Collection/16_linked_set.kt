fun main(){
    val linkedSet = linkedSetOf(3,1,2)
    linkedSet.add(2) // duplicate, won't add
    linkedSet.add(4) // new element
    println(linkedSet)// output [3,1,2,4]
    linkedSet.remove(1)
    println(linkedSet) // output : [3,2,4]
    println(linkedSet.size) // 3
    println(linkedSet.contains(5)) // output true
    println(linkedSet.elementAt(1)) // index at 1 => 2
}