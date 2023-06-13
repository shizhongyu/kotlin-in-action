package ch04.ex4_2_1_CompanionObjects

class A {
    /**
     * 伴生对象的作用是在类级别上定义一些方法和属性，而不是实例级别。它们可以像 Java 中的静态方法和属性一样被调用，而不需要创建类的实例。
     */
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}
