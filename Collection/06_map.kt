fun main(){
    val countryCodes = mutableMapOf(
        "US" to "United States",
        "KH" to "Khmer",
        "IN" to "India"
    )
    countryCodes["UK"] = "United Kingdom" // add new map element in to map
    println(countryCodes) // output: {US = United States, IN = India, ...}
}