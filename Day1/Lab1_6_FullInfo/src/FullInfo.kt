data class Address(val country: String  = "Unspecified" ,val city: String  = "Unspecified", val street: String = "Unspecified")
data class PersonalInfo(val email: String = "Unspecified", val address: Address = Address())
data class Client(val name: String = "Unspecified",val personalInfo: PersonalInfo = PersonalInfo()){
    fun getFullInfo(): String{
        val str = "Name: $name\nEmail: ${personalInfo.email}\nCountry: ${personalInfo.address.country}\nCity: ${personalInfo.address.city}\nStreet: ${personalInfo.address.street}"
        return str

    }
}

fun main(args: Array<String>){

    val alice = Client("Alice",
        PersonalInfo(email = "alice@gmail.com" ,
            address = Address("Germany","Munich")))

    println(alice.getFullInfo())
    println("---")
    println(Client("Bob").getFullInfo())
}
