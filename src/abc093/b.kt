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
    val (A, B, K) = readIntArray()

    val result = mutableListOf<Int>()

    var temp = A

    while(temp < A + K && temp <= B) {
        result.add(temp)
        temp += 1
    }

    temp = B
    while(temp > B - K && temp >= A) {
        result.add(temp)
        temp -= 1
    }

    val unique = result.distinct().sorted()

    unique.forEach { println(it) }
}
