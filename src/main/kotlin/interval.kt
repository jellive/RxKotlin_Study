import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.interval(1000, TimeUnit.MILLISECONDS)
            .subscribe { println(it) }
    Thread.sleep(3000)
}