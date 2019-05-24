fun LongestWord(str: String){
    val parts = str.split(" ")

    println(parts.maxBy {
        it.length
    })
}
fun main(args: Array<String>){

    LongestWord("bigdddddd ggg")
    LongestWord("this is a house")
}