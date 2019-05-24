fun reverseWord(sentence: String){

   sentence.split(" ").forEach {
       print(it.reversed() + " ")
   }
}

fun main(args: Array<String>){

    reverseWord("cat and dog")
}