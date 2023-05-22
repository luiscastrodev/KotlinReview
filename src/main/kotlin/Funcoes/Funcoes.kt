package Funcoes

fun main(args: Array<String>) {
    helloWorld()
    val soma = sum(2, 3)
    println("A soma de 10 e 5 $soma")

    val str = "Kotlin"
    println("Tamanho string ${str.length}")
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

fun sum_unica_linha(a: Int, b: Int) = (a + b)

fun helloWorld() = println("Hello , world")
