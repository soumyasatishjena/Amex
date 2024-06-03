// American Express Round 1

fun main() {
    //Solution - 1
    solution1()

    // Solution - 2
    solution2()
}

fun solution1() {
    for (i in 1..50) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }
    println("End of Solution 1 \n")
}

fun solution2() {
    (50..100).forEach { i ->
        println(printValue(i))
    }
    println("End of Solution 2")
}

fun printValue(i: Int): String {
    return when {
        i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
        i % 5 == 0 -> "Buzz"
        i % 3 == 0 -> "Fizz"
        else -> "$i"
    }
}
