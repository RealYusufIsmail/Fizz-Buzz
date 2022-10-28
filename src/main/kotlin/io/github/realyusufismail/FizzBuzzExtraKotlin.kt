package io.github.realyusufismail

fun main() {
    for (i in 0..100) {
        //make it shorter using StringBuilder
        val sb = StringBuilder()
        if (i % 6 == 0) sb.append("Fizz")
        if (i % 9 == 0) sb.append("Buzz")
        if (i % 3 == 0) sb.append("Fizz")
        if (i % 5 == 0) sb.append("Buzz")
        if (sb.isEmpty()) sb.append(i)
        println(sb.toString())
    }
}
