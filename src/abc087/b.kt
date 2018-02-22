package abc087

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}
private fun readInt(): Int {
    return readLine()!!.toInt()
}

fun main(args: Array<String>) {
    val A = readInt()
    val B = readInt()
    val C = readInt()
    val X = readInt()

    var ans = 0
    for(i in 0..A) {
        val a = X - 500 * i
        if(a < 0) {
            break
        }

        for(j in 0..B) {
            val b = a - 100 * j
            if (b < 0) {
                break
            }
            for(k in 0..C) {
                val c = b - 50 * k
                if(c < 0) {
                    break
                }
                if(c == 0) {
                    ans += 1
                }
            }
        }
    }

    println(ans)
}
