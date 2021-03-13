package one.digitalinovation

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Victor"
    nomes[1] = "Marcos"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }

    println("-------------------")
    nomes.sort()
    nomes.forEach { println(it) }
}