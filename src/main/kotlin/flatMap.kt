import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit
import kotlin.random.Random

fun main() {
    Observable.just(1, 2, 3)
            .flatMap{ Observable.just("$it Hello", "$it World")}
            .subscribe{println(it)}

    Observable.fromIterable(1..10).flatMapCompletable {index ->
        println("시작 $index")
        actionComplete(index, Random.nextLong(10) + 1)
    }.subscribe { println("전체 완료") }

    Thread.sleep(60_000)
}

private fun actionComplete(index: Int, delay: Long) = Completable.timer(delay, TimeUnit.SECONDS)
        .doOnComplete { println(index) }