enum class Temperature {
    Hot,Warm,Cool,Cold,Freezing
}

fun getTemperatureDescription(temperature : Int){

    when  {
        temperature >= 25 -> println(Temperature.Hot)
        temperature in 15..24 -> println(Temperature.Warm)
        temperature in 5..14 -> println(Temperature.Cool)
        temperature in -5..4 -> println(Temperature.Cold)
        temperature <= -5 -> println(Temperature.Freezing)

    }

}

fun main(args: Array<String>){

    getTemperatureDescription(30)
    getTemperatureDescription(10)
    getTemperatureDescription(-30)
}