fun main(args: Array<String>) {
    returnLoop()
}

fun returnLoop(){
    var x:Int
    println("Example of return in for-loop")
    for(x in 1..10) {
        if(x < 5){
            print("$x ")
        }else{
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")
}