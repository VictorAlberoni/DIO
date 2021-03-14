package one.digitalinovation

fun main() {

    val salarios = doubleArrayOf(1000.0, 5625.75, 2550.0)

    for (salario in salarios)  {
        println(salario)
    }
    println("---------------")

    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média de salarios: ${salarios.average()}")
    println("---------------")

    val  salariosMaiorQue2500 = salarios.filter { it > 2500 }

    salariosMaiorQue2500.forEach{println(it)}

}