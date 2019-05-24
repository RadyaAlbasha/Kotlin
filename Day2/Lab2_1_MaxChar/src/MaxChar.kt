fun maxChar(str: String){

    println( str.toCharArray().groupBy { it }.maxBy { it.value.size }?.key)
}

fun main(args: Array<String>){

    maxChar("abccccccccd aaaaaaaaaaaaaaaaa")
    maxChar("apple 1231111")
}