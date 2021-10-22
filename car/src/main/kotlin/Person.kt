data class Person (val firstName: String, val gender: Gender, val address: Address, val middleName: String, val surname : String)

data class Address(val line1: String, val line2: String, val line3: String)

enum class Gender {
    unknown, male, female
}