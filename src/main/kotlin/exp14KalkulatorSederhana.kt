fun main(args: Array<String>) {
    println("Welcome to our calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    val b = readLine()!!.toDouble()
    println("Choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")
    val choise = readLine()!!.toInt()
    var result = 0.0
    if (choise == 1) {
        result = a + b
    }else if (choise == 2){
        result = a - b
    }else if (choise == 3){
        result = a * b
    }else if (choise == 4){
        result = a / b
    }
    if ((choise > 0) && (choise < 5)){
        println("result: $result")
    }else{
        println("Invalid choise")
    }
    println("Thanks you for using our exponent calculator")
}