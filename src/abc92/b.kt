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
    val N = readInt()
    val (D, X) = readIntArray()

    var consumption = 0
    for (i in 0 until N) {
        val count = 1 + (D - 1) / readInt()
        consumption += count
    }

    print(consumption + X)

}
