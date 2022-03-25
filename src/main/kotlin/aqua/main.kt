package aqua
//for functions that are not methods we are using main class. Everything that is not a method and still a function is called instancefun


fun main ( args: Array<String>) {
    buildAquarium()
}
 fun buildAquarium(){
     val myAquarium = Aquarium() //We don't have to change to aquarium to var because we are only modifying its properties.
 //Using a constructor to describe object instance from class description
     println("Length : ${myAquarium.width}"+" Height : $myAquarium.height}")
     myAquarium.height=34
    //myAquarium.width=56
     println(myAquarium.height)
    //println(myAquarium.width)
println(myAquarium.volume) }

