fun main() {
    println("Podaj wyraz")
    var tekst: String = readln()
    tekst = tekst.lowercase()
    for(litera in tekst){
        if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u'){
            continue
        }
        print(litera)
    }

    // pobieraj od użtkownika liczby tak długo, dopóki ich suma nie będzie większa niż 10
    var suma = 0
    while (true){
        val liczba = readln().toInt()
        suma += liczba
        if(suma > 10)
            break
    }
    println("Suma to $suma")
}