import io.reactivex.rxjava3.subjects.BehaviorSubject

fun main() {
    val bs = BehaviorSubject.createDefault(100)
    bs.subscribe{println("1번째: $it")}
    bs.onNext(1)
    bs.onNext(2)
    bs.onComplete()
}