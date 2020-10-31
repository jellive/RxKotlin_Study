import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

//fun main() {
//    Observable
//        .just(0,1,2,3)
//        .map{it * 2}
//        .subscribe{println(it)}
//
//
//}

fun main() {
    val compositeDisposable = CompositeDisposable()
    val disposable1 = Observable.just(1, 2).subscribe{println(it)}
    compositeDisposable.add(disposable1)
    compositeDisposable.clear() // clear는 compositeDisposable를 초기화화만 한다.
//     compositeDisposable.dispose() // dispose는 compositeDisposable을 더 이상 사용할 수 없게 한다. (들어오자마자 Dispose됨.)

    val disposable2 = Observable.just(3, 4)
        .delay(1, TimeUnit.SECONDS) // 여기가 핵심. 1초 뒤에 구독을 하는데... 1초가 없으면 clear되기 전에 불려버려 예상과 다르게 간다.
        .subscribe{println(it)}
    compositeDisposable.add(disposable2)
    Thread.sleep(2000L)
}