fun factorial(n: Int): Int{
    if(n == 1){ // this can be a condition to stop recursion
        return 1
    }
    else{
        return n* factorial(n-1)
    }
    // like this when we pass 3 then it will run and check
    // whether it matches the first condition or not
    // if not it will move to the else. so, it becomes 3* factorial(3-1)
    // Then it will run the function of factorial(3-1 = 2)
    // thus it become 3*2*factorial(2-1 = 1)
    // again it will call the factorial (1), but this case 
    // it matches the condition of n == 1 then it returns 1
    // finally it becomes 3*2*1 (it equals 1 because it returns 1 not a factorial function anymore)
    // it equals 6
}

fun main(){
    println(factorial(3))
}