import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(0..10)
            .buffer(2, 1).subscribe { println(it) } // skip은 count가 될 때까지는 동작하지 않는다.

    
}