package ControleFuxo

fun main() {

    for (i in 1..10 step 2) {
        println(i)
    }

    val s = "kotlin"

    for (char in s) {
        println(char)
    }

    for (j in 20 downTo 0 step 2) {
        println(j)
    }

    var index = 0
    while (index <= 300) {
        println(index)
        index++
    }

    do {
        println(index)
        index++
    } while (index <= 500)
}

