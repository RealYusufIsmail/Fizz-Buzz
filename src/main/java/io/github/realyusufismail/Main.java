package io.github.realyusufismail;

public class Main {
    public static void main(String[] args) {

       for (int i = 0; i <= 100; i++) {

          if (checkIfMultipleOfThree(i)) System.out.println("Fizz");

          if (checkIfMultipleOfFive(i)) System.out.println("Buzz");

          if (checkIfMultipleOfThree(i) && checkIfMultipleOfFive(i)) System.out.println("FizzBuzz");
       }
    }

    private static boolean checkIfMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private static boolean checkIfMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}