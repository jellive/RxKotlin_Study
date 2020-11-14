import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.just("Hello", "World")
            .doOnSubscribe { println("subscribe") } // subscribe를 시작할 때 호출하는 시동 도와주기.
            .repeat(2)
            observable.subscribe{println(it)}
}