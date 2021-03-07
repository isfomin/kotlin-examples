/**
 * Класс открыт для наследования
 */
open class Rectangle(open var h:Int, open var w:Int) {
    open fun sq() = h * w
}