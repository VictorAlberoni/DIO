package one.digitalinovation

fun main() {
    val joao = funcionario("João", 2500.0, "CLT")
    val maria = funcionario("Maria", 4750.0, "PJ")
    val pedro = funcionario("Pedro", 1500.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    funcionarios1.forEach { println(it) }
    funcionarios2.forEach { println(it) }
    println("-------------")

    val resultunion = funcionarios1.union(funcionarios2)
    resultunion.forEach { println(it) }
    println("-------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val subUnion = funcionarios3.subtract(funcionarios2)
    subUnion.forEach { println(it) }
    println("-------------")

    val intersec = funcionarios3.intersect(funcionarios2)
    intersec.forEach { println(it) }

}