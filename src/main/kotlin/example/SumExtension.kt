package example

object SumExtension {
fun List<Int>.sum(): Int = this.sumOf { it }

    @JvmStatic
    fun main(args: Array<String>) {
        println(listOf(1, 2, 3).sum())
    }
}