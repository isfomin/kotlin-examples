package game

open class Weapon(lvl:Int, weight:Double):Item(lvl, weight) {
    open fun calcDamage():Int = 42
}