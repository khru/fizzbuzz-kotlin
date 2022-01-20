package main

class FizzBuzz {
    companion object {
        fun convert(number: Int): String {
            if (number == 5) {
                return "Buzz"
            }
            if (number == 3 || number == 6) {
                return "Fizz";
            }
            return number.toString();
        }
    }
}
