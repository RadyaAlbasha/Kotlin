fun generate(charactersArr: CharArray, i: Int, s: String, len: Int) {
    if (i == 0)
    {
        println(s)
    }
    else{
        for (j in 0 until len) {
            val appended = s + charactersArr[j]
            generate(charactersArr, i - 1, appended, len)
        }
    }
}

fun generatePasswords(charactersArr: CharArray, len: Int) {
    for (i in 1..len) {
        generate(charactersArr, i, "", len)
    }
}

fun main(args: Array<String>){

    val arr = charArrayOf('a','b','c')
    generatePasswords(arr, arr.size);
}