import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.range(3, 2).subscribe { println(it) }
}