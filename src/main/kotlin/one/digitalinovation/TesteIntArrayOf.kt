package one.digitalinovation

fun main() {

    val values = intArrayOf(2, 4, 6, 1, 7, 8, 10, 12)

    values.forEach {
        println(it)
    }

    println("---------------------")
    values.sort()
    values.forEach {
        println(it)
    }


}