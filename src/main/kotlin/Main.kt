import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
 feedtheFish()}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20){}

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    DAY: String){}
fun feedtheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today s $day and the fish eat $food")
    shouldChangeWater(day,temperature=20, dirty=50)

}
fun randomDay(): String {
    val week= listOf("Monday", "Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day: String) : String {
    var food = "Fasting"
    return when (day) {
    "Monday" ->"flakes"
    "Wednesday" ->"redworms"
    "Friday" -> "moosquito"
   "Sunday" -> "plankton"
    else -> "fasting"}
}
