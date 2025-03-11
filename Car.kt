open class Car () {
    var brand = ""
    var power = 0
    var price = 0.0
    open fun InfoCar(brand: String,
                     power: Int,
                     price: Double){
        println("Марка машины: $brand, Мощность машины: $power, Стоимость машины: $price")
    }
    fun ValidPower(power:Int):Boolean
    {
        if (power<30 || power >1000)
        {
            println("Введите корректную мощность. Она должна быть не меньше 30 и не больше 1000")
            return false
        }
        return true
    }
    fun ValidPrice (price: Double):Boolean
    {
        if (price<300000.0||price>142000000.0)
        {
            println("Введите корректную стоимость. Она должна быть не меньше 300000 и не больше 142000000")
            return false
        }
        return true
    }
}