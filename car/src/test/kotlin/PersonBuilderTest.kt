import Gender.male
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class PersonBuilderTest {

    val person = PersonBuilder()

    @Test
    fun `create Person using traditional code`() {
        val address = Address("line1","line2","line3")
        val jim = Person("Jim",male,address,"Robert","Smith")
        assertThat(jim.firstName).isEqualTo("Jim")
        assertThat(jim.address.line1).isEqualTo("line1")
    }

    @Test
    fun `create Person using DSL`() {

        val jim = person {
            firstName = "Jim"
            middleName = "Robert"
            surname = "Smith"
            gender = male
            address {
                line1 = "3 London Road"
                line2 = "Roadside"
                line3 = "Nottingham"
            }
        }
        assertThat(jim.firstName).isEqualTo("Jim")
        assertThat(jim.address.line1).isEqualTo("3 London Road")
    }
}