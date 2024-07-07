package main

import java.util.*

fun main() {
    val nomeDeContato : String
    val emailContato : String
    val idadeContato : Int

    val input = Scanner(System.`in`)

    print("Qual o Nome do Contato: ")
    nomeDeContato = readLine().toString()
    //nomeDeContato = input.nextLine()

    print("Qual o e-mail: ")
    emailContato = readLine().toString()
    //emailContato = input.nextLine()
    print("Qual idade: ")
    //idadeContato = readLine().toInt()
    idadeContato = input.nextInt()

    println("Nome: $nomeDeContato seu e-mail é $emailContato e sua idade é: $idadeContato ")
    println("Quantidade de caracteres do Nome é: ${nomeDeContato.length} caracteres")
    println("Autenticado no sistema ${nomeDeContato.equals("Edu")}")
    println(nomeDeContato.reversed())
    println(nomeDeContato.slice(0..1))
    println(nomeDeContato.get(3))

    println("Fim")

}