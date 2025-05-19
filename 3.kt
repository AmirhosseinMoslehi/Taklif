fun factorial(n: Int): Long {
    var result = 1L
    for (i in 2..n) result *= i
    return result
}

fun main() {
    print("یک عدد صحیح وارد کنید: ")
    val number = readLine()?.toIntOrNull() ?: return
    println("فاکتوریل $number برابر است با ${factorial(number)}")
}