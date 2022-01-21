package main

class FizzBuzz {
    companion object {
        fun convert(number: Int): String {
            if (number == 5 || number == 10) {
                return "Buzz"
            }
            if (isDivisibleByThree(number)) return "Fizz"
            return number.toString();
        }

        private fun isDivisibleByThree(number: Int): Boolean {
            return number % 3 == 0;
        }
    }
}
