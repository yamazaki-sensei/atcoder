package abc087

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

private fun readInt(): Int {
    return readLine()!!.toInt()
}

fun main(args: Array<String>) {
    val N = readInt()
    val A1 = readIntArray()
    val A2 = readIntArray()

    var ans = 0
    for (i in 0 until N) {
        val a1sub = A1.subList(0, i + 1)
        val a2sub = A2.subList(i, N)
        ans = listOf(ans, a1sub.sum() + a2sub.sum()).max()!!
    }
    println(ans)
}
