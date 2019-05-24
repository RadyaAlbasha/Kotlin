fun List<Int>.lReversed() : List<Int> {
    // 'this' corresponds to the list
    var myList:MutableList<Int> = mutableListOf()
    for (i in this.size-1 downTo 0){
        myList.add(this[i])
    }
    val list:List<Int> = myList
    return list
}
fun main(args: Array<String>){

    val list = listOf<Int>(1,2,3)

    println(list.lReversed())
}
