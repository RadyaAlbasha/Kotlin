fun LongestWord(str: String){
    val parts = str.split(" ")
    var max = Int.MIN_VALUE
    var index = 0
    var count = 0
    for (word: String in parts) {
        if(word.length > max)
        {
            max = word.length
            index = count
        }
        count++
    }
    println(parts[index])
}
fun main(args: Array<String>){

    LongestWord("big fff")
    LongestWord("this is a house")
}