package io.github.realyusufismail

fun main() {
    //prints "Foo" for multiples of 6 and "Bar" for multiples of  9 and "Baz" for multiples of 12
    for (i in 0..100) {
        if (i % 6 == 0 && i % 9 == 0 && i % 5 == 0) println("FizzBuzz + Bar + Baz") else if (i % 6 == 0 && i % 5 == 0) println(
            "FizzBuzzBar"
        ) else if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz") else if (i % 6 == 0 && i % 9 == 0) println("Fizz + Bar + Baz") else if (i % 6 == 0) println(
            "Bar"
        ) else if (i % 9 == 0) println("Baz") else if (i % 3 == 0) println("Fizz") else if (i % 5 == 0) println("Buzz") else println(
            i
        )
    }
}