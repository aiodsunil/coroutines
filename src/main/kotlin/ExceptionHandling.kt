import kotlinx.coroutines.*
import java.lang.ArithmeticException

fun main() {
    runBlocking {
        val myHandler = CoroutineExceptionHandler { _, throwable ->
            println("Exception handled : ${throwable.localizedMessage}")
        }
        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()
        val deferred=GlobalScope.async {
            println("throwing exception from async")
            throw ArithmeticException("Exception from async")
        }
    }
}