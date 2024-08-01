class Outer{
    var name:String="kawsar"
    inner class inner{
        var name="kawsar"
        fun display(){
            println(name)
        }
    }
}
fun main(){
    val out=Outer()
    val inner=out.inner()
    inner.display()
}