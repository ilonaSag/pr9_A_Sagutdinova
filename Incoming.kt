class Incoming(number:String,
    date: String,
    length: Double,
               codCity: Int,):Mobile(number,
    date,
    length,
    codCity) {
    // вывод информации о звонке
    override fun DisplayInfo() {
        println("Входящий звонок:")
        super.DisplayInfo()
    }
    //был ли звонок пропущен
    fun Missed(): Boolean {
        return length == 0.0
    }
}
