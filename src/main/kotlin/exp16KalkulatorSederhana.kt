fun main(args: Array<String>) {
    println("Welcome to our calculator")
    var go0n = "yes"
    while (go0n == "yes"){
        println("Enter the first number")
        val a = readLine()!!.toDouble()
        println("Enter the second number")
        val b = readLine()!!.toDouble()
        println("Choose one of the following operations:")
        println("1 - addition")
        println("2 - subtraction")
        println("3 - multiplication")
        println("4 - division")
        val choise = readLine()!!.toInt()
        var result = 0.0
        when (choise){
            1 -> result = a + b
            2 -> result = a - b
            3 -> result = a * b
            4 -> result = a / b
        }
        if ((choise > 0) && (choise < 5)){
            println("Result: $result")
        }else{
            println("Invalid choise")
        }
        println("Would you like to make another calculation? [yes/no]")
        go0n = readLine()!!
    }
    println("Thanks you for using our calculator")
}