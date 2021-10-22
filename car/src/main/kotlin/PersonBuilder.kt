class PersonBuilder {
    var firstName: String = ""
    var middleName: String = ""
    var surname: String = ""

    var gender: Gender = Gender.unknown
    private val addressBuilder = AddressBuilder(this)

    operator fun invoke(block: PersonBuilder.() -> Unit): Person {
        block()
        return build()
    }

    fun address(block: AddressBuilder.() -> Unit) {
        addressBuilder.block()
    }

    fun build() : Person {
        return Person(firstName, gender, addressBuilder.build(),middleName,surname)
    }
}