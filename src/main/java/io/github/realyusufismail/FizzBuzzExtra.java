package io.github.realyusufismail;

public class FizzBuzzExtra {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            //make it shorter using StringBuilder
            StringBuilder sb = new StringBuilder();
            //make it shorter using StringBuilder
            

            if (i % 6 == 0 && i % 9 == 0 && i % 5 == 0) sb.append("FizzBuzz + Bar + Baz");
            else if (i % 6 == 0 && i % 5 == 0) sb.append("FizzBuzzBar");
            else if (i % 3 == 0 && i % 5 == 0) sb.append("FizzBuzz");
            else if (i % 6 == 0 && i % 9 == 0) sb.append("Fizz + Bar + Baz");
            else if (i % 6 == 0) sb.append("Bar");
            else if (i % 9 == 0) sb.append("Baz");
            else if (i % 3 == 0) sb.append("Fizz");
            else if (i % 5 == 0) sb.append("Buzz");
            else sb.append(i);

            System.out.println(sb.toString());

            //need one if per condition
            var sb2 = new StringBuilder();

        }
    }
}
