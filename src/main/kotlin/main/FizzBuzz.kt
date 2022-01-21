package main

class FizzBuzz {
    companion object {
        fun convert(number: Int): String {
            if (isDivisibleByFive(number)) return "Buzz"
            if (isDivisibleByThree(number)) return "Fizz"
            return number.toString();
        }

        private fun isDivisibleByThree(number: Int): Boolean {
            return number % 3 == 0;
        }

        private fun isDivisibleByFive(number: Int): Boolean {
            return number % 5 == 0;
        }
    }
}
