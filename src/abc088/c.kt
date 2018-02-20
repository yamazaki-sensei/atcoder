package abc088

fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

fun main(args: Array<String>) {
    val c1 = readIntArray()
    val c2 = readIntArray()
    val c3 = readIntArray()

    val a1 = 0
    val b1 = c1[0] - a1
    val b2 = c1[1] - a1
    val b3 = c1[2] - a1
    val a2 = c2[1] - b2
    val a3 = c3[2] - b3

    val a = arrayOf(a1, a2, a3)
    val b = arrayOf(b1, b2, b3)
    val c = arrayOf(c1, c2, c3)

    for (i in 0..2) {
        for(j in 0..2) {
            if(a[i] + b[j] != c[i][j]) {
                println("No")
                return
            }
        }
    }

    print("Yes")
}
