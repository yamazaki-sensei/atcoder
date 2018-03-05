package abc089

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

private fun readInt(): Int {
    return readLine()!!.toInt()
}
fun main(args: Array<String>) {
    print(readInt() / 3)
}
