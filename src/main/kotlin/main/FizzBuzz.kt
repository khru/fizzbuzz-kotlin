package main

class FizzBuzz {

    companion object {
        const val CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_THREE: String = "Fizz"
        const val CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_FIVE: String = "Buzz"
        const val CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_THREE_AND_FIVE: String = "FizzBuzz"

        fun convert(number: Int): String {
            if (isDivisibleByFiveAndThree(number)) return CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_THREE_AND_FIVE
            if (isDivisibleByFive(number)) return CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_FIVE
            if (isDivisibleByThree(number)) return CONVERSION_FOR_NUMBERS_DIVISIBLE_BY_THREE
            return number.toString();
        }

        private fun isDivisibleByThree(number: Int): Boolean {
            return number % 3 == 0;
        }

        private fun isDivisibleByFive(number: Int): Boolean {
            return number % 5 == 0;
        }

        private fun isDivisibleByFiveAndThree(number: Int): Boolean {
            return number % 15 == 0;
        }
    }
}
