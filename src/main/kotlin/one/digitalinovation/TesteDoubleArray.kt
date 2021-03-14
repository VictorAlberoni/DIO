package one.digitalinovation

fun main() {

    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 6000.0
    salarios[2] = 2500.0
    salarios.forEach { println(it) }
    println("--------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println(salarios[index])
    }
    println("--------------------")
    salarios.forEach { println(it) }

    println("--------------------")
    val salarios2 = doubleArrayOf(1500.0,5000.0,300.0)
    salarios2.sort()
    salarios2.forEach { println(it) }


}