    class SimpleTime (val hours : Int = 0, val  minutes: Int = 0 , val seconds: Int = 0 ,val nanoseconds: Int = 0 ){
        fun toNanoOfDay() : Any{
            val totalNanoseconds= (hours * 3600000000000) + (minutes * 60000000000) + (seconds * 1000000000) + nanoseconds
            return totalNanoseconds
        }
        fun toSecondOfDay() : Any{
            val totalSeconds= (hours * 3600) + (minutes * 60) + seconds + (nanoseconds * (1/1000000000))
            return  totalSeconds
        }
    }

    fun main(args: Array<String>){
        val noon = SimpleTime(12)
        println(noon.toSecondOfDay())

        val halfPastSeven = SimpleTime(hours = 6 , minutes = 30)
        println(halfPastSeven.toNanoOfDay())

        val nanoseconds = SimpleTime(nanoseconds = 1)
        println(nanoseconds.toNanoOfDay())

        val second = SimpleTime(seconds = 1)
        println(second.toNanoOfDay())
    }