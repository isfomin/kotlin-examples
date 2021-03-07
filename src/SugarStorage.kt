class SugarStorage(var volume:Int) {

    fun decreaseSugar(v:Int) {
        if (v < 0) return
        this.volume -= v
        if (volume < 0) this.volume = 0
    }

    fun increaseSugar(v:Int) {
        if (v < 0) return
        this.volume += v
    }
}