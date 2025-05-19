fun fibonacci(n: Int): List<Int> {
    if (n <= 0) return emptyList()
    if (n == 1) return listOf(0)
    val list = mutableListOf(0, 1)
    while (list.size < n) {
        list.add(list[list.size - 1] + list[list.size - 2])
    }
    return list
}

fun main() {
    print("تعداد جملات فیبوناچی: ")
    val count = readLine()?.toIntOrNull() ?: return
    println("دنباله فیبوناچی: ${fibonacci(count)}")
}