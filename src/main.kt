fun main(){
   school()
    nameandAge()
    length()
   myName()
}


fun school(){
   var name="Akirachix"
   println(name[1].toString()+name[3]+name[4])
}
fun nameandAge(){
   var name= "My name is Esther i'm"
   var age= "20 years old"
   var statement=(name+" "+ age)
   println(statement)
}
fun length(){
   var name="Marie"
   println(name.length)

}
fun myName(){
   var name="Nalenyi"
   if (name=="Nalenyi")
      println("that's me")
   else
      println("I don't know who that is")
}
