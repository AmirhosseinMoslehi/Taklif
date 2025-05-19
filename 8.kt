fun calculator(a: Double, b: Double, op: Char): Double? {
    return when (op) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> if (b != 0.0) a / b else null
        else -> null
    }
}

fun main() {
    print("عدد اول: ")
    val a = readLine()?.toDoubleOrNull() ?: return
    print("عملگر (+, -, *, /): ")
    val op = readLine()?.firstOrNull() ?: return
    print("عدد دوم: ")
    val b = readLine()?.toDoubleOrNull() ?: return

    val result = calculator(a, b, op)
    if (result != null) {
        println("نتیجه: $result")
    } else {
        println("عملیات نامعتبر یا تقسیم بر صفر.")
    }
}