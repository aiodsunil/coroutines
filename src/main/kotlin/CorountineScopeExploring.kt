import kotlinx.coroutines.*

fun main():Unit= runBlocking{
        println(sum())
    println("current thread ${Thread.currentThread()}")



}
suspend fun sum(): Long = coroutineScope {
    val sum1=async(Dispatchers.Default) {
        println("sum1 current thread  ${Thread.currentThread()}")

        3+3L
    }
    val sum2=async {
        println("sum2 current  thread  ${Thread.currentThread()}")
        3+4L
    }
   return@coroutineScope sum1.await()
}

