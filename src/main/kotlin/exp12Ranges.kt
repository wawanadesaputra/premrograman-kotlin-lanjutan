fun main(args: Array<String>) {
    //Ranges
    val i:Int = 2
    for (j in 1..4)
        print(j) // prints "1234"
    println()

    if (i in 1..10) { //Equivalent of 1 <= i && i <=10
        println("We found your number --" + i)
    }
}