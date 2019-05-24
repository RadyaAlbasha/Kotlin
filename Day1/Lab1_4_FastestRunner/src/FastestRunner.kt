class Frinds(val name: String , val time: Int)

fun main(args: Array<String>){

    val arr = arrayListOf<Frinds>(Frinds("Ahmed",341),
        Frinds("Mohamed",273),
        Frinds("Ismail",278),
        Frinds("Hend",329),
        Frinds("Aly",445),
        Frinds("Hossam",402),
        Frinds("Ola",388),
        Frinds("Alaa",275),
        Frinds("Basma",243),
        Frinds("Mina",334),
        Frinds("Nada",412),
        Frinds("Saad",393))
    var min = Frinds("",Int.MAX_VALUE)
    var smin = min
    for (f : Frinds in arr){
       if(f.time < min.time){
           smin = min
           min=f

       }
    }
    println(min.name +" "+ min.time)
    println(smin.name +" "+ smin.time)

}