package ch07.PointPlusMember

/**
 * "operator" 是 Kotlin 编程语言中的一个关键字，它用于定义一些特殊的运算符函数。在 Kotlin 中，运算符函数可以像使用内置运算符一样使用自定义类型之间的运算符。
 * 例如，可以通过定义一个名为 "plus" 的运算符函数来重载加号运算符 "+", 使其能够在自定义类型之间进行加法运算。
 *
 * 以下是 Kotlin 中一些常见的运算符函数及其对应的关键字：
 *
 * - `operator fun plus(other: T): T`：重载加号运算符 "+"
 * - `operator fun minus(other: T): T`：重载减号运算符 "-"
 * - `operator fun times(other: T): T`：重载乘号运算符 "*"
 * - `operator fun div(other: T): T`：重载除号运算符 "/"
 * - `operator fun rem(other: T): T`：重载取模运算符 "%"
 * - `operator fun inc(): T`：重载前缀自增运算符 "++"
 * - `operator fun dec(): T`：重载前缀自减运算符 "--"
 * - `operator fun unaryPlus(): T`：重载一元加号运算符 "+"
 * - `operator fun unaryMinus(): T`：重载一元减号运算符 "-"
 * - `operator fun compareTo(other: T): Int`：重载比较运算符 "<", ">", "<=", ">="
 *
 * 除了上述运算符函数之外，"operator" 关键字还可以用于定义其他类型的函数，例如类型转换函数和下标运算符函数。
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1.plus(p2))
//    println(p1 + p2)
}
