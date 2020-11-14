import io.reactivex.rxjava3.core.Observable

fun main() {
    val items = arrayOf("Hello", "World")
    Observable.fromArray(*items) // spread operator.
            .subscribe{println(it)}
}