fun main (){
    try {
        var car = Car()
        var truck = Truck()
        println("Введите марку машины:")
        car.brand = readLine()!!.toString()
        println("Введите мощность машины:")
        car.power = readLine()!!.toInt()
        println("Введите стоимость машины:")
        car.price = readLine()!!.toDouble()
        if (car.ValidPower(car.power)&&car.ValidPrice(car.price)) {
            car.InfoCar(car.brand, car.power, car.price)

        }
    }
    catch (e: Exception)
    {
        println("Неверный ввод")
    }
}