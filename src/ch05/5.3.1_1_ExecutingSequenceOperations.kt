package ch05.ex3_1_1_ExecutingSequenceOperations


/**
 * Kotlin序列（Sequence）是一种惰性计算的集合，类似于Java 8中的Stream。它们可以用于处理大型数据集，因为它们只在需要时计算元素，而不是一次性计算所有元素。
 *
 * 以下是一些使用Kotlin序列的常见操作：
 *
 * 1. `map` - 将序列中的每个元素转换为另一个元素，并生成一个新序列。
 *
 *    示例：
 *    ````
 *    val nums = sequenceOf(1, 2, 3)
 *    val squaredNums = nums.map { it * it }
 *    println(squaredNums.toList()) // 输出 [1, 4, 9]
 *    ```
 *
 * 2. `filter` - 根据给定的条件过滤序列中的元素，并生成一个新序列。
 *
 *    示例：
 *    ````
 *    val nums = sequenceOf(1, 2, 3, 4, 5)
 *    val evenNums = nums.filter { it % 2 == 0 }
 *    println(evenNums.toList()) // 输出 [2, 4]
 *    ```
 *
 * 3. `take` - 从序列中获取指定数量的元素，并生成一个新序列。
 *
 *    示例：
 *    ````
 *    val nums = sequenceOf(1, 2, 3, 4, 5)
 *    val firstThreeNums = nums.take(3)
 *    println(firstThreeNums.toList()) // 输出 [1, 2, 3]
 *    ```
 *
 * 4. `drop` - 从序列中删除指定数量的元素，并生成一个新序列。
 *
 *    示例：
 *    ````
 *    val nums = sequenceOf(1, 2, 3, 4, 5)
 *    val lastTwoNums = nums.drop(3)
 *    println(lastTwoNums.toList()) // 输出 [4, 5]
 *    ```
 *
 * 5. `flatMap` - 将序列中的每个元素转换为另一个序列，并将所有序列合并为一个序列。
 *
 *    示例：
 *    ````
 *    val words = sequenceOf("hello", "world")
 *    val flattenedChars = words.flatMap { it.asSequence() }
 *    println(flattenedChars.toList()) // 输出 [h, e, l, l, o, w, o, r, l, d]
 *    ```
 *
 * 这些是常见的Kotlin序列操作，还有其他操作可以在Kotlin文档中找到。
 */
fun main(args: Array<String>) {
   val list = listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
}
