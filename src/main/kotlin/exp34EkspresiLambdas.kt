fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    //Lambda function
    val myLambda : (String) -> Unit = {s:String -> print(s)}
    val v:String = "Jurusan Teknik Informatika"
    myLambda(v)

    //Inline Function
    myFun(v, myLambda) //Passing lambda as a parameter of another function
}

fun MyFunction(x: String): String {
    var c:String = "Hey!! welcome to---"
    return(c+x)
}

fun myFun(a:String, action:(String)-> Unit){ //passing lambda
    print("\nHeyyy!!!")
    action(a) //call to lambda function
}