import main.FizzBuzz
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

class FizzBuzzShould {

    @ParameterizedTest
    @ValueSource(ints = [3,6,9,12])
    fun `return Fizz when a divisible by three number it's given`(number: Int) {
        assertEquals("Fizz", FizzBuzz.convert(number))
    }

    @Test
    fun `return Buzz when 5 given`() {
        assertEquals("Buzz", FizzBuzz.convert(5))
    }

    @Test
    fun `return Buzz when 10 given`() {
        assertEquals("Buzz", FizzBuzz.convert(10))
    }

    @Test
    fun `return a 1 when 1 given`() {
        assertEquals("1", FizzBuzz.convert(1))
    }

}