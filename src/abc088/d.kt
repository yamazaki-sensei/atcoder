package abc088

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}
private fun readCharArray(): CharArray {
    return readLine()!!.toCharArray()
}
fun main(args: Array<String>) {
    val first = readIntArray()
    val H = first[0]
    val W = first[1]

    val s: MutableList<CharArray> = mutableListOf()
    for (i in 0 until H) {
        s.add(readCharArray())
    }

    var count = 0
    for(i in 0 until H) {
        for(j in 0 until W) {
            if(s[i][j] == '.') {
                count += 1
            }
        }
    }

    val ans = bfs(s, W, H)

    println(if (ans < 0) "-1" else count - ans -1)

}

private val dx = arrayListOf(1, 0, -1, 0)
private val dy  = arrayListOf(0, 1, 0, -1)
private val INVALID = -1

fun bfs(s: List<CharArray>, W: Int, H: Int): Int {

    val queue: MutableList<Pair<Int, Int>> = mutableListOf()
    queue.add(Pair(0, 0))

    val d: MutableList<MutableList<Int>> = mutableListOf()

    for(i in 0 until H) {
        d.add(mutableListOf())
        for(j in 0 until W) {
            d[i].add(INVALID)
        }
    }
    d[0][0] = 0

    while(!queue.isEmpty()) {
        val p = queue[0]
        queue.removeAt(0)

        if (p.first == H - 1 && p.second == W - 1) {
            break
        }

        for(i in 0 until 4) {
            val ny = p.first + dy[i]
            val nx = p.second + dx[i]

            if (0 <= nx && nx < W &&
                0 <= ny && ny < H &&
                s[ny][nx] != '#' &&
                d[ny][nx] == INVALID
            ) {
                queue.add(Pair(ny, nx))
                d[ny][nx] = d[p.first][p.second] + 1
            }
        }
    }

//    for(i in 0 until H) {
//        println(d[i])
//    }

    return d[H - 1][W - 1]
}
