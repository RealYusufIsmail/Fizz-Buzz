package io.github.realyusufismail;

public class FizzBuzzExtra {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            //make it shorter using StringBuilder
            StringBuilder sb = new StringBuilder();

            //check if number i is divisible by 6 or 9 or 3 and 5 and adds it to the StringBuilder
            //Then prints all together
            if (i % 6 == 0) sb.append("Bar");
            if (i % 9 == 0) sb.append("Baz");
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            //check if it is empty and if true print the number
            if (sb.length() == 0) sb.append(i);

            System.out.println(sb);
        }
    }
}
