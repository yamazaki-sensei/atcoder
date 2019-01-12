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
    var (A, B, C) = readIntArray().sorted()
    var count = 0

    while(B < C) {
        A += 1
        B += 1
        count += 1
    }
    while(A < B) {
        A += 2
        count += 1
    }
    if(A > B) {
        count += 1
    }

    print(count)
}
