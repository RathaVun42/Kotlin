fun main(){
    val hashMap = hashMapOf(1 to "One", 2 to "Two")
    hashMap[3] = "Three"
    hashMap.remove(2)
    println(hashMap)// output {1 = One, 3 = Three}
    println(hashMap[1]) // output One
    hashMap.forEach({
        (key, value)-> println("Key: $key, Value: $value")
    })
}