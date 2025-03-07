import java.time.LocalDate
open class Mobile(//number:String,
             //date: LocalDate,
             //length: Int,
             //codCity: Int,

) {
    var number = ""
    var length = 0.0
    var data = LocalDate.now()
    var codCity = 0
    open fun ValidNum(number:String) {
        val first = number[0]
        val two = number[1]
            if (number == "") {
                println("Номер телефона не может быть пустым")
                return
            } else if (number.length != 12) {
                println("Номер телефона не может быть меньше 12")
                return
            } else if (first != '+' || two != '7') {
                println("Номер начинается неправильно")
                return
            }
        }
    open fun ValidLength(length:Double){
        if (length<0.0||length==0.0)
            println("Продолжительность разговора не может быть отрицатеьной и не может равняться 0")
        if (length == null)
            println("Продолжительность разговора должна быть введена")
    }
    open fun ValidCod (codCity:Int)
    {
        if (!(codCity in 900..999))
        {
            println("Введите корректный код")
        }
        if (codCity == null)
            println("Код должен быть введен")
    }
    fun Price (){
        val price = 10*length
        println("Стоимость звонка = $price")
    }
}