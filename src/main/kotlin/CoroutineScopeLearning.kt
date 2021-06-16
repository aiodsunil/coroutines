//import kotlinx.coroutines.*
//
//class CoroutineScopeLearning{
//    private val scope = CoroutineScope(Dispatchers.Default)
//    fun callingFun() {
//        scope.launch { SuspendClass().hello() }
//    }
//
//    fun destroy() {
//        scope.cancel() // cancels all coroutines launched in this scope
//        // ... do the rest of cleanup here ...
//    }
//
//}
//
//fun main():Unit= runBlocking {
//CoroutineScopeLearning().callingFun()
//CoroutineScopeLearning().destroy()
//}
//
//class  SuspendClass{
//
//    suspend fun hello() {
//        println("Hello World")
//    }
//}