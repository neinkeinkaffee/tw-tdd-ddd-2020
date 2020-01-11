package com.thoughtworks;


public class FizzBuzzWhizz {
    public static String fizzBuzz(int i) {
        Number number = new Number(i);
        if (number.containsDigit(7)) {
            return "Whizz";
        }
        if (number.containsDigit(5)) {
            return "Buzz";
        }
        if (number.containsDigit(3)) {
            return "Fizz";
        }
        if (number.isMultipleOf(210)) {
            return "FizzBuzzWhizz";
        }
        if (number.isMultipleOf(15)) {
            return "FizzBuzz";
        }
        if (number.isMultipleOf(35)) {
            return "BuzzWhizz";
        }
        if (number.isMultipleOf(21)) {
            return "FizzWhizz";
        }
        if (number.isMultipleOf(3)) {
            return "Fizz";
        }
        if (number.isMultipleOf(5)) {
            return "Buzz";
        }
        if (number.isMultipleOf(7)) {
            return "Whizz";
        }
        return String.valueOf(i);
    }

    public static class Number {
        private int i;

        public Number(int i) {
            this.i = i;
        }

        public boolean isMultipleOf(int j) {
            return this.i % j == 0;
        }

        public boolean containsDigit(int j) {
            return String.valueOf(this.i).indexOf(String.valueOf(j)) > -1;
        }
    }
}
