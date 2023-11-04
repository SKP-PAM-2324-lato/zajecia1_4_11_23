fun main() {
    println("Wprowadz rok:")
    val rok: Int = readln().toInt()

    val type = when {
        (rok % 4 != 0) -> "zwykły"
        (rok % 100 != 0) -> "przestępny"
        (rok % 400 != 0) -> "zwykły"
        else -> "przestępny"
    }

    println("Rok $rok jest rokiem $type")
}