package aqua
import kotlin.math.PI
open class A
class Aquarium {
    val width: Int = 20
    var height: Int = 20
    var length: Int = 45

 var volume: Int
  get() = width* height*length/1000
set(value) {height = (value*1000)/(width * length)}
}





