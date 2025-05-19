import kotlin.random.Random

fun guessNumberGame() {
    val target = Random.nextInt(1, 101)
    var guess: Int
    println("بازی حدس عدد! یک عدد بین 1 تا 100 حدس بزن.")
    do {
        print("حدس شما: ")
        guess = readLine()?.toIntOrNull() ?: continue
        when {
            guess < target -> println("عدد بزرگ‌تره!")
            guess > target -> println("عدد کوچک‌تره!")
            else -> println("آفرین! درست حدس زدی.")
        }
    } while (guess != target)
}

fun main() {
    guessNumberGame()
}