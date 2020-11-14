import io.reactivex.rxjava3.core.Observable

fun main() {
    println("start: ${System.currentTimeMillis()}")
    fun createItem(): String {
        println("create: ${System.currentTimeMillis()}")
        return "HelloWorld"
    }

    val observable = Observable.fromCallable{ createItem()}

    Thread.sleep(1000)
    observable.subscribe { println(it) }
    Thread.sleep(1000)
    observable.subscribe{println(it)}
}