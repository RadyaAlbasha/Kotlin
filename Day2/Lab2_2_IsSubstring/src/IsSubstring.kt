fun isSubstring(sentence: String , substring : String){

    println(  sentence.contains(substring))

}

fun main(args: Array<String>){

    isSubstring("go home" , "ome")
    isSubstring("go home" , "me")
    isSubstring("go home" , "abc")
}