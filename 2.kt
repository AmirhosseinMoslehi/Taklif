fun reverseString(input: String): String {
    return input.reversed()
}

fun main() {
    print("یک رشته وارد کنید: ")
    val text = readLine() ?: ""
    val reversed = reverseString(text)
    println("رشته معکوس شده: $reversed")
}