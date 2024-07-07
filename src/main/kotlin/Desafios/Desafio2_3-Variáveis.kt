package main.Desafios

import java.util.*


fun main() {
    val scan = Scanner(System.`in`)
    val N = scan.nextInt()
    try {
        val S = N.toString()



        if (S.javaClass.simpleName == "String" && N == Integer.parseInt(S))
            println("Bom trabalho!")
        else
            println("Resposta errada!")

    } catch (e: Exception) {
        println("Resposta errada!")
    }

}