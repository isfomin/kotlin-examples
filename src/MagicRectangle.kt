/**
 * Пример наследования
 */
class MagicRectangle(override var h:Int, override var w:Int):Rectangle(h, w), Magic {
    override fun sq() = super.magic() * super.sq()
}