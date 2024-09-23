fun main(args: Array<String>) {
    //array lists (mutable) bisa diubah
    /*
    Method:
        Clear(), contains(), size, get() or [], add(), or +=, remove(), or -=,
        removeAt(), toTypeArray(), lastIndexOf(), removeAll(), reserve()
    */
    val arrayList = arrayListOf(1, 2 ,3)
    print("ArrayList array: ")
    for(item in arrayList){
        print("$item")
    }
    print("\n")

    arrayList+= 9

    print("Tambahkan elemen 9 dalam ArrayList: ")
    println(arrayList)

    arrayList.reverse()
    println("Reserve arrayList: ")
    println(arrayList)

    arrayList -= 1 //We can delete
    print("Remove last element in arrayList: ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList: ")
    println(arrayList)
}