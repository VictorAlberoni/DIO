package one.digitalinovation

fun main() {
    val joao = funcionario("João", 2500.0)
    val maria = funcionario("Maria", 4750.0)
    val pedro = funcionario("Pedro", 1500.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{println(it)}
    println("----------------------")
    println(funcionarios.find { it == maria })
}

data class funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: R$ $salario
        """.trimIndent()
}

