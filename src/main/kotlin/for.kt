fun main() {

    for(i in 1..5){
        println(i)
    }
    println("-------------------")

    //pętla pusta
    for(i in 5..1){
        println(i)
    }
    println("-------------------")
    for(i in 5 downTo 1){
        println(i)
    }

    println("-------------------")
    for(i in 1..5 step 2){
        println(i)
    }

    println("-------------------")
    for(i in 5 downTo 1 step 2){
        println(i)
    }

    println("-------------------")
    val tekst = "Kotlin"
    for(litera in tekst){
        print("$litera ")
    }

}