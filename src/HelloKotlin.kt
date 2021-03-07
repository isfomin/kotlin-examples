import game.MagicWeapon
import game.Player
import game.Weapon

fun main() {
//    val sumUser: String = readLine() ?: return
//
//    val sum: Int = sumUser.toInt()
//
//    val tax: Double = calcTax(sum)
//
//    println("For $sum tax is $tax")
//
//    println(calcChairs(12))
    demoWhen()
    println(getYearEra(2123))
    demoWhile()
    println(calculateEvenDigits("660308340"))

    val p: Player = Player(str = 2)
    p.receiveXP(10)
    p.receiveXP(100)
    p.receiveXP(100)

    val r:Rectangle = MagicRectangle(4, 3);
    println(r.sq())

    val w:Weapon = MagicWeapon(1, 1.0)
    println("damage = ${w.calcDamage()}")
}

/** Get year era */
fun getYearEra(year: Int): String? {
    return when {
        year < 1970 -> "before"
        year == 1970 -> "equals"
        year in 1971..2000 -> "after (XX century)"
        year in 2001..2100 -> "after (XXI century)"
        year > 2100 -> "distant future"
        else -> null
    }
    //enter your function implementation here
}

/** Demo loops */
fun demoWhile() {
    var x = 100
    while (x > 0) {
        x--
    }

    for (i in 0..15 step 2) {
        println(i)
    }

    for (i in 0 until 5) {
        println("loop2: $i")
    }
}

/** Calculation bug mentions */
fun calculateBugMentions(input:List<String>): Int{
    // enter your function code here
    var bugs: Int = 0
    for (word in input) {
        if (word == "BUG") bugs++
    }
    return bugs
}

/** Counter even digits */
fun calculateEvenDigits(input:String): Int{
    var sum: Int = 0
    for (char in input) {
        val value: Int = char.toString().toInt()
        if (value % 2 == 0) {
            sum += value
        }
    }
    return sum
}

/** Demo when construction */
fun demoWhen() {
    val t = 4
    when (t) {
        3 -> println("==3")
        4,5 -> println("5 or 4")
        in 3..4 -> println("3..4")
    }
}

/** Calculation tax */
fun calcTax(sum: Int = 1000): Double {
    val taxRatio = 0.13
    return sum.toDouble() * taxRatio
}

/* Calculation chairs */
fun calcChairs(bugs: Int): Int {
    // enter your function code here
    return bugs+bugs/2
}