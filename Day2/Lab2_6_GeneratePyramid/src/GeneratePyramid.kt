fun pyramid(num: Int){
    var m = 0
    for (n in 1..num)
    {
        print('\'')
        for (s in 1..num-n)
        {
            print(" ")
        }
        while (m < (2*n-1)){
            print("#")

            ++m
        }
        for (s in 1..num-n)
        {
            print(" ")
        }
        println('\'')
        m = 0
    }
}

fun main(args: Array<String>){

    pyramid(100)
}