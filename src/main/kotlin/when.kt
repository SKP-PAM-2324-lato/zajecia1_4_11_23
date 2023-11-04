fun main() {
    val a = 12
    val b = 5

    println("Podaj operator: +, -, * lub /")
    val operator = readln()

    /*
    val wynik =
        if (operator == "+"){
            a+b
        }else if(operator == "-"){
            a-b
        }else if(operator == "*"){
            a*b
        }else{
            a/b
        }

     */

    val wynik = when(operator){
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> "błędny operator"
    }
    println("Wynik to $wynik")

    val n = -1
    when(n){
        1, 2, 3 -> println("N jest dodatnie, mniejsze od 4")
        0 -> println("n jest zerem")
        -1, -2 -> println("n to -1 lub -2")
    }

    val d = 101
    when(d){
        in 1..10 -> println("d jest <= 10")
        in 10..100 -> println("d jest pomiedzy 10 a 100")
    }
}