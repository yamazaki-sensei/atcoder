package abc088


fun main(args: Array<String>) {
    val N = Integer.parseInt(readLine())
    val A = Integer.parseInt(readLine())

    val result = if (N % 500 <= A) "Yes" else "No"
    println(result)
}