import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(0..3)
            .scan{t1: Int, t2: Int -> t1 + t2}
            .subscribe{println(it)}
}