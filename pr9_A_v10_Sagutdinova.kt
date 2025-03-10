fun main(){
    try {
        println("Введите номер:")
        val number = readLine()!!.toString()
        println("Введите дату в формате ГГГГ-ММ-ДД:")
        val date = readLine()!!.toString()
        println("Введите продолжительность разговора:")
        val length = readLine()!!.toDouble()
        println("Введите код города:")
        val codCity = readLine()!!.toInt()
        var mobile = Mobile(number,date,length,codCity)
        var incoming = Incoming(number,date,length,codCity)
        val rouming = true
        var outgoing = Outgoing(number,length,date,codCity, rouming)
        if (mobile.ValidNum(mobile.number)&&mobile.ValidDate(mobile.date)&&
            mobile.ValidLength(mobile.length)&&mobile.ValidCod(mobile.codCity)) {
            mobile.DisplayInfo()
            mobile. Price()
            println("\nДанные входящего звонка:")
            incoming.DisplayInfo()
            println("Пропущенный звонок: ${incoming.Missed()}")
            println("\nДанные исходящего звонка:")
            outgoing.DisplayInfo()
            println("Долгий звонок: ${outgoing.LongCall()}")

        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
