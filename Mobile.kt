open class Mobile(number:String,
    date: String,
    length: Double,
    codCity: Int,
) {
    var number = number
    var date = date
    var length = length
    var codCity = codCity

    // вывод информации о звонке
    open fun DisplayInfo()
    {
        println("Номер: $number, Длина: $length сек, Дата: $date, Код города: $codCity")
    }
    //Проверка номера
    open fun ValidNum(number:String):Boolean {
        if (number.isEmpty()) {
            println("Номер телефона не может быть пустым")
            return false
        }
        if (number.length != 12) {
            println("Номер телефона должен содержать 12 символов")
            return false
        }
        if (number[0] != '+' || number[1] != '7') {
            println("Номер должен начинаться с +7")
            return false
        }
        return true
        }
    // проверка продолжительности разговора
    open fun ValidLength(length:Double):Boolean{
        if (length<0.0) {
            println("Продолжительность разговора не может быть отрицатеьной")
            return false
        }
        return true
    }
    // проверка кода гоорода
    open fun ValidCod (codCity:Int):Boolean
    {
        if (!(codCity in 900..999))
        {
            println("Введите корректный код")
            return false
        }
        if (codCity == null) {
            println("Код должен быть введен")
            return false
        }
        return true
    }
    //проверка даты
        fun ValidDate(date: String): Boolean {
            if (date.length != 10) {
                println("Дата должна содержать 10 символов (ГГГГ-ММ-ДД)")
                return false
            }
            if (date[4] != '-' || date[7] != '-') {
                println("Дата должна быть в формате ГГГГ-ММ-ДД (используйте '-' как разделитель)")
                return false
            }
            val parts = date.split("-")
            if (parts.size != 3) {
                println("Дата должна состоять из трех частей: год, месяц, день")
                return false
            }
            val year = parts[0]
            val month = parts[1]
            val day = parts[2]
            if (!year.all { it.isDigit() } || !month.all { it.isDigit() } || !day.all { it.isDigit() }) {
                println("Год, месяц и день должны состоять только из цифр")
                return false
            }
            val monthInt = month.toInt()
            val dayInt = day.toInt()

            if (monthInt < 1 || monthInt > 12) {
                println("Месяц должен быть от 1 до 12")
                return false
            }

            if (dayInt < 1 || dayInt > 31) {
                println("День должен быть от 1 до 31")
                return false
            }
            return true
        }
    //цена за звонок
    open fun Price (){
        val price = 10*length
        println("Стоимость звонка = $price")
    }
}
