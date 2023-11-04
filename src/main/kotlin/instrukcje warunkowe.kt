fun main() {
    println("Podaj liczbe:")
    val liczba: Int = readln().toInt()

    if(liczba > 0){
        println("To jest liczba dodatnia")
    }else if(liczba < 0){
        println("To jest liczba ujemna")
    }
    else{
        println("To jest zero")
    }

    if(liczba > 10){
        println("Większa od 10")
    }else if (liczba > 5){
        println("Wieksza od 5")
    }

    if(liczba > 10){
        println("Większa od 10")
    }
    if (liczba > 5){
        println("Wieksza od 5")
    }

}