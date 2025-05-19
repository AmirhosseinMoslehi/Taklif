fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun main() {
    print("یک رشته وارد کنید: ")
    val input = readLine() ?: ""
    if (isPalindrome(input)) {
        println("این رشته یک پالینـدروم است.")
    } else {
        println("این رشته پالینـدروم نیست.")
    }
}