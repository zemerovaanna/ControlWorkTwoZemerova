import kotlinx.coroutines.*
var mashina = Car()
suspend fun main() {
    println("Дай циферку друг 😘")
    var n = readln().toInt()
    GlobalScope.launch {
        for (i in 0..n) {
            mashina.GetCarInfo()
        }
        delay(5000L)
    }
    mashina.RefuelInteresuet()
    delay(10000L)
}
