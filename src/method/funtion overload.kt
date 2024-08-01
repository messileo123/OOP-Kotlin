package method

fun main(){
    sum( 2,10)

}

fun sum(a:Int, b:Int) {
    println(a+b)
}

fun sum(a:String, b:Double, c:Int) {       
    println(a+b+c)
}

fun sum(a:Int, b:Double, c:String) {
    println(c+a+b)
}

fun main(a:Double, b:Double):Double {
    return(a+b)
}
