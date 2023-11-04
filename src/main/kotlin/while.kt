fun main() {

    var i = 1

    while(i < 10){
        println("Wartość i: $i")
        i++
    }

    // ile wynosi suma liczb od 1 do 100
    i = 1
    var suma = 0

    while(i <= 100){
        suma += i
        i++
    }

    println("Suma liczba z zakresu <1,100> to $suma")

    // ile jest liczb parzystych z przedziału <0,100>
    var l = 0
    var liczbaParzystych = 0
    while (l<=100){
        if(l%2 == 0){
            liczbaParzystych++
        }
        l++
    }
    println("Liczba parzystych wynosi $liczbaParzystych")

    var d = 100
    while(d>100){
        println("while $d")
        d--
    }

    do{
        println("do while $d")
        d--
    }while(d>100)

    // Pobieraj od uzytkownika tak dlugo liczby całkowite, dopóki nie wprowadzi on
    // liczby 0. Na koniec podaj sumę wprowadoznych liczb

}