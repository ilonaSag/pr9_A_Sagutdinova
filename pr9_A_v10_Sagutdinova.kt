fun main(){
    try {
        var mobile = Mobile()
        println("Выберите:")
        println("1. Ввести свой телефонный звонок")
        println("2. Ввести свой входящий звонок")
        println("3. Ввести свой исходящий звонок")
        println("4. Выход")
        val n = readLine()!!.toInt()
        when (n) {
          1-> {
              println("Введите номер теефона:")
              mobile.number = readLine()!!.toString()
              mobile.ValidNum(mobile.number)
              println("Введите продолжительность разговора:")
              mobile.length = readLine()!!.toDouble()
              mobile.ValidLength(mobile.length)
              println("Введите код города:")
              mobile.codCity = readLine()!!.toInt()
              mobile.ValidCod(mobile.codCity)
          }

        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
