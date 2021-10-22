class AddressBuilder(private val personBuilder: PersonBuilder) {

    var line1 : String = ""
    var line2 : String = ""
    var line3 : String = ""

    fun build() : Address {
        return Address(line1,line2,line3)
    }

}