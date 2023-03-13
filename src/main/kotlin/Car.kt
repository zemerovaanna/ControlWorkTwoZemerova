class Car(): Avtomobil() {
    var price:UInt = 10000U
    var releaseYear:String = "2012"
    var condition:String = "Excellent"

    override fun GetCarInfo() {
        println("Собственно информация по машинке:\nБачок: $fuelTank\nСколько бензина в баке: $gasAmount\nРасход на 100 км: $gasPerHundredkm\nПробег: $mileage\nЦена: $price\nДата выпуска: $releaseYear\nСостояние: $condition")
    }
    fun Drive(km : UInt) {
        var temp:Double
        var tempkm:Double
        temp = km.toDouble() * 0.07
        if (gasAmount >= temp.toUInt()){
            gasAmount -= temp.toUInt()
            mileage += km
        }
        else {
            temp = gasAmount.toDouble()
            tempkm = km.toDouble() - (temp / 0.07)
            println("Бензина хватило только на $tempkm км")
        }
    }
    fun RefuelInteresuet() {
        var temp = (gasAmount / fuelTank) * 100U
        if (temp > 10u){
            println("Заправка?\nНе интересует")
        }
        else{
            println("Заправочка?\n Интересует")
        }
    }

}