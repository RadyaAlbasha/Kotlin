fun reverseInt(num : Int){
    val str :String = num.toString()
    var revStr = ""

    if(str[0].equals('-')){
        revStr+="-"
        for (i in str.length-1 downTo 1 ){

            revStr += str[i].toString()
        }
    }
    else
    {
        for (i in str.length-1 downTo 0 ){

            revStr += str[i].toString()
        }
    }

    println(revStr.toInt())
}

fun main(args: Array<String>){

    reverseInt(15)
    reverseInt(981)
    reverseInt(500)
    reverseInt(-15)
    reverseInt(-90)
}