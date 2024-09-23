import javax.net.ssl.HostnameVerifier

fun main(args: Array<String>) {
    //Panggil tanpa argumen
    connectToDb()
    println()
    //panggil dengan 2 argumen
    connectToDb("sqlserver", "wawan")
}

fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password: String = "secret"){
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}