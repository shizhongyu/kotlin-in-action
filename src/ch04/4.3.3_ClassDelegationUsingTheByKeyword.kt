package ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

/**
 *Kotlin 委托（delegation）是一种实现代码重用的机制，它允许将某个类的实现委托给另一个类来完成。这种机制可以避免代码的重复编写，提高代码的可维护性和可读性。
 *
 * 在 Kotlin 中，委托通过关键字 `by` 实现。可以将一个类的实现委托给另一个类，前提是两个类都要实现相同的接口或者拥有相同的父类。具体来说，当一个对象被委托给另一个对象时，委托对象会将所有的方法调用转发给被委托对象。
 *
 * 下面是一个使用委托的示例：
 *
 * ```kotlin
 * interface Base {
 *     fun print()
 * }
 *
 * class BaseImpl(val x: Int) : Base {
 *     override fun print() { println(x) }
 * }
 *
 * class Derived(b: Base) : Base by b
 *
 * fun main() {
 *     val b = BaseImpl(10)
 *     Derived(b).print() // 输出 10
 * }
 * ```
 *
 * 在这个示例中，有一个 `Base` 接口和实现了 `Base` 接口的 `BaseImpl` 类。`Derived` 类使用 `by` 关键字将 `Base` 接口的实现委托给 `b` 对象，即 `Derived` 类的实例会将所有 `Base` 接口的方法调用转发给 `b` 对象。在 `main` 函数中，我们创建了一个 `BaseImpl` 对象 `b`，并将其传递给 `Derived` 类的构造函数。`Derived` 类的 `print()` 方法最终会调用 `BaseImpl` 类的 `print()` 方法，并输出 `10`。
 *
 * 除了实现接口的委托，Kotlin 还支持属性委托。属性委托可以让我们将属性的 getter 和 setter 方法委托给另一个对象来实现，从而可以实现更加灵活的属性访问机制。例如，我们可以使用属性委托来实现延迟初始化、属性值校验等功能。
 *
 *
 */
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { println(x) }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")


    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}
