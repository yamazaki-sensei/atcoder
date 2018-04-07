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
    val ans = mutableListOf<MutableList<Int>>()
    for(i in 0 until 100) {
        val base = mutableListOf<Int>()
        for(j in 0 until 100) {
            base.add(0)
        }
        ans.add(base)
    }

    println(ans)

}
