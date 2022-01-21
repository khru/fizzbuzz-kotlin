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

    @ParameterizedTest
    @ValueSource(ints = [1,2,4,7,8])
    fun `return the number as string when a number is not multiple of three and five given`(number: Int) {
        assertEquals(number.toString(), FizzBuzz.convert(number))
    }

    @Test
    fun `return FizzBuzz when a numbers it's divisible by 15` () {
        assertEquals("FizzBuzz", FizzBuzz.convert(15))
    }

    @Test
    fun `return FizzBuzz when a numbers it's divisible by 30` () {
        assertEquals("FizzBuzz", FizzBuzz.convert(30))
    }

}