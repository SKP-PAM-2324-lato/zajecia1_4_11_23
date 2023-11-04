fun main() {
    var sum = 0
    /*
    do {
        println("Wprowadz liczbę")
        val num = readln().toInt()
        sum += num

    }while (num != 0)

    println("Summa = $sum")
     */

    println("Wprowadz liczbę")
    var num = readln().toInt()
    while(num != 0){
        println("Wprowadz liczbę")
        num = readln().toInt()
        sum += num
    }
}