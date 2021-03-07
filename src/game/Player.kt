package game

class Player(var str:Int = 0, var dex:Int = 0, var XP:Int = 0, var lvl:Int = 1, var nextLvlXP:Int = 10) {
    fun receiveXP(xp:Int) {
        XP+=xp
        if (XP >= nextLvlXP) lvlUp()
        println("str=${str} dex=${dex} XP=${XP} lvl=${lvl}")
    }

    private fun lvlUp() {
        lvl++
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0

        nextLvlXP += 100
    }
}