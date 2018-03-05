package abc089

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

    val S: MutableList<String> = mutableListOf()

    var M: Long = 0
    var A: Long = 0
    var R: Long = 0
    var C: Long = 0
    var H: Long = 0
    for(i in 0 until N) {
        val name = readLine()!!
        if(name.startsWith("M")) M++
        if(name.startsWith("A")) A++
        if(name.startsWith("R")) R++
        if(name.startsWith("C")) C++
        if(name.startsWith("H")) H++
    }

    var ans: Long = 0
    ans += M * A * R
    ans += M * A * C
    ans += M * A * H
    ans += M * R * C
    ans += M * R * H
    ans += M * C * H
    ans += A * R * C
    ans += A * R * H
    ans += A * C * H
    ans += R * C * H

    print(ans)
}
