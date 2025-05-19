fun countLetters(str: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
    }
    return map
}

fun main() {
    print("یک رشته وارد کنید: ")
    val input = readLine() ?: ""
    val result = countLetters(input)
    println("تعداد تکرار حروف: $result")
}