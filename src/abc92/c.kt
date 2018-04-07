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
    val A = readIntArray()

    var all: Long = 0
    for (i in 0 until N) {
        if(i == 0) {
            all += Math.abs(A[0])
        } else {
            all += Math.abs(A[i] - A[i - 1])
        }
    }
    all += Math.abs(A[N - 1])

    for (i in 0 until N) {
        if (i == 0) {
            println(all + Math.abs(A[1]) - Math.abs(A[0]) - Math.abs(A[1] - A[0]))
        } else if(i == N - 1) {
            println(all + Math.abs(A[N - 2]) - Math.abs(A[N - 1] - A[N - 2]) - Math.abs(A[N - 1]))
        } else {
            println(all + Math.abs(A[i + 1] - A[i - 1]) - Math.abs(A[i] - A[i - 1]) - Math.abs(A[i + 1] - A[i]))
        }
    }
}
