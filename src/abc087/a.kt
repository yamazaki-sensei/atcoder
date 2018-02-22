package abc087

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}
fun main(args: Array<String>) {
    val X = readIntArray()[0]
    val A = readIntArray()[0]
    val B = readIntArray()[0]

    println((X - A) % B)

}
