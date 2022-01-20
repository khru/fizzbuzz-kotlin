import main.FizzBuzz
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzShould {
    @Test
    fun `return Fizz when 3 given`() {
        assertEquals("Fizz", FizzBuzz.convert(3))
    }

    @Test
    fun `return Fizz when 6 given`() {
        assertEquals("Fizz", FizzBuzz.convert(6))
    }

    @Test
    fun `return Fizz when 9 given`() {
        assertEquals("Fizz", FizzBuzz.convert(9))
    }

    @Test
    fun `return Buzz when 5 given`() {
        assertEquals("Buzz", FizzBuzz.convert(5))
    }

    @Test
    fun `return a 1 when 1 given`() {
        assertEquals("1", FizzBuzz.convert(1))
    }

}