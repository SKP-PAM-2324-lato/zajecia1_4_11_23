fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    var max =
        if(a>b){
            if(a>c){
                a
            }
            else{
                c
            }
        }else{
            if(b>c){
                b
            }else{
                c
            }
        }


    max =
        if (a>=b && a>=c){
            a
        }else if(b>=a && b>=c){
            b
        }else{
            c
        }

    // sposob z zalozeniem
    max = a
    if(b > max){
        max = b
    }
    if(c > max){
        max = c
    }

    println(max)

}