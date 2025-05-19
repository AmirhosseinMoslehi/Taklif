fun bubbleSort(list: MutableList<Int>): List<Int> {
    for (i in 0 until list.size) {
        for (j in 0 until list.size - i - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
    return list
}

fun main() {
    val numbers = mutableListOf(23, 12, 5, 78, 1)
    println("لیست اولیه: $numbers")
    val sorted = bubbleSort(numbers)
    println("لیست مرتب‌شده: $sorted")
}