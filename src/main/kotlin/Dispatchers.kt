import kotlinx.coroutines.*

fun main() {
    runBlocking {
//        launch (Dispatchers.Main){
//            println("Main dispatcher thread : ${Thread.currentThread().name}")
//        }
        launch (Dispatchers.Unconfined){
            println("Unconfined1 thread : ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined2 thread : ${Thread.currentThread().name}")
        }
        launch (Dispatchers.Default){
            println("Main Default thread : ${Thread.currentThread().name}")
        }
        launch (Dispatchers.IO){
            println("IO dispatcher thread : ${Thread.currentThread().name}")
        }
        launch (newSingleThreadContext("my thead")){
            println("newSingleThreadContext : ${Thread.currentThread().name}")
        }
    }
}