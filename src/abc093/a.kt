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
    val s = readTextArray()[0]!!

    if (s.contains('a') && s.contains('b') && s.contains('c')) {
        println("Yes")
    } else {
        println("No")
    }
}
