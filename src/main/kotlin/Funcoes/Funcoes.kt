package Funcoes

import kotlin.math.round

fun main() {
    helloWorld()
    val soma = sum(2, 3)
    println("A soma de 10 e 5 $soma")

    val str = "Kotlin"
    println("Tamanho string ${str.length}")
    println(round(303.93))

    nome(cidade = "Ca", estado = "SP")

    println(media( 10f, 10f))
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

fun sum_unica_linha(a: Int, b: Int) = (a + b)

fun helloWorld() = println("Hello , world")

fun bonusWhen(cargo: String) =

    when (cargo) {
        "Gerente" -> {
            2000f
        }

        "Estagiario" -> {
            500f
        }

        else -> {
            0f
        }
    }

fun nome(cidade: String, estado: String, numero: Int = 0) {

}

fun media(vararg notas: Float): Double {

    return  notas.average()
}
