package ch05.ex1_5_1_MemberReferences


/**
 * Kotlin 中的成员引用可以使用 `::` 符号来表示。它允许您引用类或对象的属性或方法，而不必调用它们。
 *
 * 以下是一些示例：
 *
 * 1. 引用类的属性：
 *
 * ```
 * class MyClass(val value: Int)
 *
 * val propertyRef = MyClass::value
 * println(propertyRef(MyClass(42))) // 输出 42
 * ```
 *
 * 2. 引用类的方法：
 *
 * ```
 * class MyClass {
 *     fun myFunction() {
 *         println("Hello, world!")
 *     }
 * }
 *
 * val functionRef = MyClass::myFunction
 * functionRef(MyClass()) // 输出 "Hello, world!"
 * ```
 *
 * 3. 引用对象的属性和方法：
 *
 * ```
 * class MyClass(var value: Int)
 *
 * val myObject = MyClass(42)
 * val propertyRef = myObject::value
 * val functionRef = myObject::myFunction
 *
 * println(propertyRef.get()) // 输出 42
 * functionRef() // 输出 "Hello, world!"
 * ```
 *
 * 在这些示例中，我们使用 `::` 符号来引用类或对象的属性或方法，并将它们存储在变量中。然后，我们可以使用这些变量来访问属性或调用方法，而不必显式地指定类或对象。
 */
fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute)
}
