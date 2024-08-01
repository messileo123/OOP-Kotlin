package `nested and inner`

class outer{
    var name:String="kawsar"
    class nested{
        var outer=outer()
        fun display(){
            println(outer.name)
        }
    }
}
fun main(){
    val out =outer()
    val nested=outer.nested()
    nested.display()
}