package inheritance

class bussinessman( name:String, age:Int, gender:String,var annualincome:Int):person(name,age,gender) {

    fun display() {
        println("name:$name")
        println("age:$age")
        println("gender:$gender")
        println("annualincome:$annualincome")

    }
}