import java.util.*

fun main() {
    val liczba1: Int = 55
    val liczba2: Long = liczba1.toLong()
    println("$liczba1 $liczba2")

    val liczba3 = 12345
    val liczba4: Byte = liczba3.toByte()
    println("$liczba3 $liczba4")

    println("Podaj imie")
    val imie = readLine()
    println("Cześć, masz na imię $imie")
    println("Ile masz lat")
    var wiek: Int = readln().toInt()
    wiek += 10
    println("Za 10 lat bedzie miał $wiek lat")

    //metoda (zaciagnieta z Javy)
    val scanner = Scanner(System.`in`)
    println("Ile masz lat")
    var wiek2: Int = scanner.nextInt()
    wiek2 += 10
    println("Za 10 lat bedzie miał $wiek2 lat")
}