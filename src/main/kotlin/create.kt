import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.create<String> { emitter ->
        emitter.onNext("Hello")
        emitter.onNext("World")
        emitter.onComplete()
    }.subscribe{println(it)}
}