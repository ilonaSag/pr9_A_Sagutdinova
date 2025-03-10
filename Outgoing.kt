class Outgoing(
    number: String,
    length: Double,
    date: String,
    codCity: Int,
    val isRoaming: Boolean
) : Mobile(number, date, length,codCity) {
    // вывод информации о звонке
    override fun DisplayInfo() {
        println("Исходящий звонок:")
        super.DisplayInfo()
        println("Роуминг: ${if (isRoaming) "Да" else "Нет"}")
    }
    // был ли звонок долгим
    fun LongCall(): Boolean {
        return length > 60
    }
}
