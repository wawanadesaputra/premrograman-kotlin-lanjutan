fun main(args: Array<String>) {
    //safe calling
    //?.left
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }

    //The ?. chaining
    //student?.teacher?.supervisor?.name = "Seymour Skinner"
}