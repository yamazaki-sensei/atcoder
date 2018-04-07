package abc089

import java.util.*

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

    val (H, W, D) = readIntArray()

    val A: MutableList<List<Int>> = mutableListOf()

    for(i in 0 until H) {
        A.add(readIntArray())
    }

    val p = Array(H * W + 1, { i -> Pair(0, 0)})
    for(i in 0 until A.size) {
        for (j in 0 until A.first().size) {
            p[A[i][j]] = Pair(i, j)
        }
    }

    val cost = Array(H * W + 1, { i -> 0 })
    (D + 1 until H * W).forEach {
        val pp = p[it]
        val ppp = p[it - D]
        cost[it] = cost[it - D] + Math.abs(pp.first - ppp.first) + Math.abs(pp.second - ppp.second)
    }
    println(Arrays.toString(cost))

    val Q = readInt()
    for(i in 0 until Q) {
        val (L, R) = readIntArray()
        println(cost[R] - cost[L])
    }
}
