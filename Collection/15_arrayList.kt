fun main(){
    val arrayList = arrayListOf(1,2,3,4)
    arrayList.add(5)
    arrayList.remove(4)
    println(arrayList)

    println("Size: ${arrayList.size}")
    println("Contains 3: ${arrayList.contains(3)}")
    println("Element at index 1: ${arrayList[1]}")
}