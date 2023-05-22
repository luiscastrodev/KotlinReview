package Variaveis


fun main() {

    println("Ola, Mundo!")

    val nome = "Luis"

    println("Ola $nome")

    val multiplicar: (Int, Int) -> Int = { a, b -> a * b }


}

fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}
