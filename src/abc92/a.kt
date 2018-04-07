package abc92

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

private fun readInt(): Int {
    return readLine()!!.toInt()
}

private fun readTextArray(): List<String> {
    return readLine()!!.split(" ")
}

fun main(args: Array<String>) {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val d = readInt()

    print(Math.min(a, b) + Math.min(c, d))
}
