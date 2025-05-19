fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    print("یک عدد وارد کنید: ")
    val number = readLine()?.toIntOrNull() ?: return
    if (isPrime(number)) {
        println("$number یک عدد اول است.")
    } else {
        println("$number عدد اول نیست.")
    }
}