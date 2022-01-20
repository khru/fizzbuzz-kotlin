import main.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzShould {
    @Test
    fun `return Fizz when 3 given`() {
        assertEquals("Fizz", FizzBuzz.convert(3))
    }

    @Test
    fun `return Buzz when 5 given`() {
        assertEquals("Buzz", FizzBuzz.convert(5))
    }

}