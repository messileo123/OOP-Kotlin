package inheritance

 class teachar( name:String, age:Int, gender:String,var teacharID:Int):person(name,age,gender) {

  fun display() {
   println("name:$name")
   println("age:$age")
   println("gender:$gender")
   println("teachartID:$teacharID")
  }
 }