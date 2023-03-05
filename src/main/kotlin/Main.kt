fun main() {
    var x=Human("michael", 15, 39)
    x.eat(2)
  x.speak("I would love to understand kotlin very well.")
x.birthday()
println()
var me=User("Emmanuel","Omara","mari@gmail.com","0775387676","128710")
    println(me.firstName)
    println(me.lastName)
}
//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
//lass User with these fields: firstName, lastName, email,
//phoneNumber, password
////2. Create a data cord. Create an instance of User and print out any 2
//attributes

class Human(var name:String,var age:Int ,var weight:Int,){
    fun eat(foodWeight:Int){
        var newWeight=weight+foodWeight
        println("I am eating $newWeight kgs of food")

    }
    fun speak(speech:String){
        var stmt=speech
        println(stmt)

    }
fun birthday() {
    var newAge = ++age
    println(newAge)


}
}


//lass User with these fields: firstName, lastName, email,
//phoneNumber, password
data class User(var firstName:String,var lastName:String, var email:String,var phoneNumber:String, var password:String){
}



