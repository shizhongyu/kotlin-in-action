package ch03.ex4_2_Varargs


/**
 * 在 Kotlin 中，星号 `*` 可以用作展开运算符，它在不定参数、数组或可变参数的上下文中使用。
 *
 * 具体地说，星号 `*` 可以用于以下情况：
 *
 * 1. 不定参数函数：在函数定义时，可以使用星号 `*` 来指定一个不定参数，这意味着函数可以接受任意数量的参数。例如：
 *
 *    ````kotlin
 *    fun printAll(vararg strings: String) {
 *        for (string in strings) {
 *            println(string)
 *        }
 *    }
 *
 *    printAll("foo", "bar", "baz") // prints "foo", "bar", "baz"
 *    printAll("hello", "world")   // prints "hello", "world"
 *    ```
 *
 * 2. 数组：在调用函数时，可以使用星号 `*` 来展开一个数组，将其作为不定参数传递给函数。例如：
 *
 *    ````kotlin
 *    val strings = arrayOf("foo", "bar", "baz")
 *    printAll(*strings) // prints "foo", "bar", "baz"
 *    ```
 *
 * 3. 可变参数：在调用函数时，可以使用星号 `*` 来展开一个可变参数，将其作为不定参数传递给函数。例如：
 *
 *    ````kotlin
 *    fun printAll(vararg strings: String) {
 *        for (string in strings) {
 *            println(string)
 *        }
 *    }
 *
 *    val args = arrayOf("foo", "bar", "baz")
 *    printAll(*args) // prints "foo", "bar", "baz"
 *    ```
 *
 * 总的来说，星号 `*` 在 Kotlin 中主要用于函数的不定参数、数组和可变参数的展开操作。
 */
fun main(args: Array<String>) {
//    val args = arrayOf("foo", "bar", "baz")
    val list = listOf("args: ", *args)
    println(list)
}

