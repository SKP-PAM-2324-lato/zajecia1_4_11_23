import kotlin.math.roundToInt

fun main() {
    print("Wpisz kwotę: ")
    val amount = readln().toDouble()
    val tax: Double = when(amount) {
        in 0.0..3089.0 -> {
            0.0
        }
        in 3089.0.. 85528.0 -> {
            0.18 * (amount - 3089)
        }
        else -> {
            0.32 * (amount - 85528) + 0.18 * (85528 - 3089)
        }
    }
    println("Twój podatek to ${tax.roundToInt()}")

}