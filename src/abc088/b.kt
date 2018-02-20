package abc088

fun main(args: Array<String>) {
    val N = Integer.parseInt(readLine())
    val a = (readLine()!!.split(" ")).map { it.toInt() }

    val sorted = a.sorted().reversed()

    var alice = 0
    var bob = 0
    for (i in 0..N-1) {
        if (i % 2 == 0) {
            alice += sorted[i]
        } else {
            bob += sorted[i]
        }
    }

    println(alice - bob)
}
