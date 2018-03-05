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
    val S = readTextArray()

    for(s in S) {
        if(s == "Y") {
            print("Four")
            return
        }
    }

    print("Three")
}
