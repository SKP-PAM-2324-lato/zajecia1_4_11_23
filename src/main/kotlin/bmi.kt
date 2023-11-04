fun main() {
    println("Podaj swoja wage w kg:")
    val waga: Double = readLine()!!.toDouble()
    println("Teraz podaj swoj wzrost w cm:")
    var wzrost: Double = readLine()!!.toDouble()
    wzrost /= 100
    wzrost *= wzrost
    val bmi: Double = waga/wzrost
    println("Twoje BMI wynosi: $bmi")

    val interpretacja =
        if(bmi < 18.49) {
           "niedowaga"
        }
        else if(bmi< 24.99) {
           "waga prawidłowa"
        }
        else if(bmi< 29.99) {
            "nadwaga"
        }
        else{
            "otyłość"
        }

    println("Interpretacja: $interpretacja")
}