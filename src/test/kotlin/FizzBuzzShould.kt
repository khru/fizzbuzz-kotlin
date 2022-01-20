import main.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzShould {
    @Test
    fun `return fizz when 3 given`() {
        assertEquals("Fizz", FizzBuzz.convert(3))
    }

}