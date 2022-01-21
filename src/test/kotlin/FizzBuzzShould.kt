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

    @ParameterizedTest
    @ValueSource(ints = [5,10,20,25])
    fun `return Buzz when a divisible by five number it's given`(number: Int) {
        assertEquals("Buzz", FizzBuzz.convert(number))
    }

    @Test
    fun `return a 1 when 1 given`() {
        assertEquals("1", FizzBuzz.convert(1))
    }

    @Test
    fun `return a 2 when 2 given`() {
        assertEquals("2", FizzBuzz.convert(2))
    }

    @Test
    fun `return a 4 when 4 given`() {
        assertEquals("4", FizzBuzz.convert(4))
    }

}