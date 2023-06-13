package ch05.ex2_2_2_AllAnyCountFind1

/**
 * 在 Kotlin 中，`List` 类型提供了三个函数：`any`、`all` 和 `none`，这些函数都可以用于判断集合中的元素是否满足某个条件，但它们的行为略有不同：
 *
 * 1. `any` 函数：判断集合中是否存在至少一个元素满足指定条件。
 *
 * ```
 * val list = listOf(1, 2, 3, 4, 5)
 * val hasEvenNumber = list.any { it % 2 == 0 } // true
 * ```
 *
 * 在上面的例子中，`any` 函数返回 `true`，因为集合中有偶数。
 *
 * 2. `all` 函数：判断集合中的所有元素是否都满足指定条件。
 *
 * ```
 * val list = listOf(1, 2, 3, 4, 5)
 * val allEvenNumbers = list.all { it % 2 == 0 } // false
 * ```
 *
 * 在上面的例子中，`all` 函数返回 `false`，因为集合中有奇数。
 *
 * 3. `none` 函数：判断集合中是否不存在任何一个元素满足指定条件。
 *
 * ```
 * val list = listOf(1, 2, 3, 4, 5)
 * val noNegativeNumbers = list.none { it < 0 } // true
 * ```
 *
 * 在上面的例子中，`none` 函数返回 `true`，因为集合中没有负数。
 *
 * 因此，这三个函数的区别在于它们对集合中元素是否满足指定条件的判断方式不同。`any` 函数只需要有一个元素满足条件即可返回 `true`，而 `all` 函数需要所有元素都满足条件才能返回 `true`，`none` 函数则需要所有元素都不满足条件才能返回 `true`。
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
}
