class Truck(brand: String,
            power: Double,
            price: Double,
            val capacity: Double,):Car(){
    override fun InfoCar(brand: String, power: Int, price: Double) {
        super.InfoCar(brand, power, price)
        println("Грузоподъемность $capacity")
    }
    fun ValidCapacity (capacity: Double):Boolean
    {
        if (capacity <=2000.0)
        {
            println("Введите корректную грузоподъемность. Она должна быть не меньше 2т")
            return false
        }
        return true
    }
}