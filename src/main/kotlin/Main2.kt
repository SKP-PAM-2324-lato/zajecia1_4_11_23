fun main() {
    val a = 7
    val b = 8.5
    val suma = a+b
    println(suma)

    val c = 9.0
    val d = 5
    println(c-d)
    println(c*d)

    val e = 10
    val f = 3
    println(e/f)
    val dzielenie = 10.0/3
    println(dzielenie)

    // reszta z dzielenia przez 3 (0,1,2)
    println(10%3)

    var g = 11
    // to samo co g = g+10
    g += 10
    println(g)
    // inkrementacja, to samo co g += 1 , czyli g = g + 1
    g++
    println(g)

    println(a > b)
    println(11 >= 10)
    println(12 == 12)
    println(12 != 12)

    // or || and &&
    println("Prawda lub prawda ${true || true}")
    println("Prawda lub fałsz ${true || false}")
    println("Fałsz lub prawda ${false || true}")
    println("Fałsz lub fałsz ${false || false}")

    println("Prawda i prawda ${true && true}")
    println("Prawda i fałsz ${true && false}")
    println("Fałsz i prawda ${false && true}")
    println("Fałsz i fałsz ${false && false}")

    val a1 = 10
    val a2 = 15
    val a3 = 9
    println((a1 > a2) || (a3 <= a2))
    println((a1 > a2) && (a3 <= a2))

    /*
    val b1 = 4
    val b2 = 4.0
    println(b1 == b2)
     */
    /*
    val b1: Int = 4
    val b2: Byte = 4
    println(b1 == b2)
     */



}