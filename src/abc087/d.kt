package abc087

private fun readIntArray(): List<Int> {
    return readLine()!!.split(" ").map{ it.toInt() }
}

private fun readInt(): Int {
    return readLine()!!.toInt()
}

private fun bfs(x: Int, graph: MutableList<MutableList<Pair<Int, Int>>>, people: MutableList<Int>) {
    if(people[x] != Int.MAX_VALUE) {
        return
    }

    val unvisited = mutableListOf(x)
    people[x] = 0
    while (unvisited.size > 0) {
        val now = unvisited[0]
        unvisited.removeAt(0)
        for(next in graph[now]) {
            if (people[next.first] == Int.MAX_VALUE) {
                people[next.first] = people[now] + next.second
                unvisited.add(next.first)
            }
        }
    }
}

fun main(args: Array<String>) {
    val (N, M) = readIntArray()

    val graph: MutableList<MutableList<Pair<Int, Int>>> = mutableListOf()
    val people: MutableList<Int> = mutableListOf()
    for(i in 0 until N + 1) {
        people.add(Int.MAX_VALUE)
    }
    for(i in 0 until N + 1) {
        graph.add(mutableListOf())
    }

    for (i in 0 until M) {
        val (L, R, D) = readIntArray()
        graph[L].add(Pair(R, D))
        graph[R].add(Pair(L, -D))
    }

    for (i in 1 until N + 1) {
        bfs(i, graph, people)
    }

    for (i in 1 until N + 1) {
        for (p in graph[i]) {
            if (people[p.first] - people[i] != p.second) {
                println("No")
                return
            }
        }
    }

    println("Yes")
}

