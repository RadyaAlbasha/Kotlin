
fun maxChar(str: String){

    var mCount = 0
    var mChar = ' '

    var count = 0

    for (c: Char in str) {

        for (cc  in str)
        {
            if(c == cc)
            {
                count ++
            }
        }
        if(count > mCount){
            mCount = count
            mChar = c
        }
        count = 0
    }
    println(mChar)
}

fun main(args: Array<String>){

    maxChar("abccccccccd aaaaaaaaaaaaaaaaa")
    maxChar("apple 1231111")
}