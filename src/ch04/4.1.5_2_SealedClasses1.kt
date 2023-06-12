package ch04.ex1_5_2_SealedClasses1


/**
 * Kotlin 中的 `sealed` 关键字用于声明一个密封类，它的作用是限制一个类的继承，使其只能在同一个文件的作用域内被继承。
 *
 * 这个限制的作用是让编译器可以在编译时判断出所有可能出现的子类，从而使得在使用 `when` 表达式时，所有可能的情况都被覆盖，从而避免了运行时出现未处理的情况。
 *
 * 例如，我们可以定义一个简单的密封类 `Expr`，它有两个子类 `Const` 和 `Sum`：
 *
 * ```
 * sealed class Expr
 * class Const(val value: Int) : Expr()
 * class Sum(val left: Expr, val right: Expr) : Expr()
 * ```
 *
 * 我们可以使用 `when` 表达式来处理 `Expr` 的不同子类：
 *
 * ```
 * fun eval(expr: Expr): Int =
 *     when (expr) {
 *         is Const -> expr.value
 *         is Sum -> eval(expr.left) + eval(expr.right)
 *     }
 * ```
 *
 * 由于 `Expr` 是一个密封类，因此编译器可以确定所有可能的子类，所以在 `when` 表达式中不需要处理其他情况，编译器会强制要求我们处理所有可能的情况，从而避免了在运行时出现未处理的情况。
 *
 * 因此，`sealed` 关键字的作用是让编译器能够对继承关系进行更严格的限制，从而帮助我们避免一些潜在的运行时错误。
 */
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
