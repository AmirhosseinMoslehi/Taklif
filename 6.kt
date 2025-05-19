fun findMax(list: List<Int>): Int {
    var max = list[0]
    for (num in list) {
        if (num > max) max = num
    }
    return max
}

fun main() {
    val numbers = listOf(12, 45, 3, 67, 89, 23)
    println("لیست: $numbers")
    println("بزرگ‌ترین عدد: ${findMax(numbers)}")
}