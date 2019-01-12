private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

private fun readLongArray(): List<Long> {
    return readLine()!!.split(" ").map{ it.toLong() }
}

private fun readInt(): Int {
    return readLine()!!.toInt()
}

private fun readTextArray(): List<String> {
    return readLine()!!.split(" ")
}

fun main(args: Array<String>) {
    val Q = readInt()

    for(i in 0 until Q) {
        val (A, B) = readLongArray().sorted()
        val score = A * B
        val sqrt = findSqrt(score)
        if(sqrt % 2L == 0L) {
            println((sqrt - 1) * 2)
        } else {
            println(sqrt * 2 - 1)
        }
    }
}

fun findSqrt(l: Long): Long {
    if (l == 1L) {
        return 1
    }
    var x = l
    var d = l

    while(d > 0) {
        val x1 = (x + l / x) / 2
        d = x - x1
        x = x1
    }

    return x
}
