package inheritance

  class student( name:String, age:Int, gender:String,var studentID:Int):person(name,age,gender) {
   fun display(){
    println("name:$name")
    println("age:$age")
    println("gender:$gender")
    println("studentID:$studentID")
   }

}