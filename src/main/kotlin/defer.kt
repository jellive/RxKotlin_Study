import io.reactivex.rxjava3.core.Observable
import kotlin.random.Random

fun main() {
//    val observable = Observable.defer {
//        Observable.create<Int> {
//            println("생산")
//            it.onNext(1)
//        }
//    }
//    observable.subscribe{println(it)}
//    observable.subscribe{println(it)}

    val observable:Observable<String> = Observable.defer {
        if(Random.nextBoolean()) {
//            it.onNext("참")
            getTrueObservable()
        }else {
//            it.onNext("거짓")
            getFalseObservable()
        }
    }
    observable.subscribe { println(it) } // 이 코드를 부를 때 결정된다.
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
}

private fun getTrueObservable(): Observable<String> {
    return Observable.create<String> {
        it.onNext("참")
    }
}

private fun getFalseObservable(): Observable<String> {
    return Observable.create<String> {
        it.onNext("거짓")
    }
}