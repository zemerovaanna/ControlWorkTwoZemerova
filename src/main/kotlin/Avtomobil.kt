abstract class  Avtomobil : SobstvennoCarInfo {
    var fuelTank:UInt = 25U
    var gasAmount:UInt = 0U
    var gasPerHundredkm:UInt = 7U
    var mileage:UInt = 0U

    override fun GetCarInfo() {
        println("Собственно информация по машинке:\nБачок: $fuelTank\nСколько бензина в баке: $gasAmount\nРасход на 100 км: $gasPerHundredkm\nПробег: $mileage")
    }
    fun Refuel(gas : UInt): UInt {
        var left:UInt
        if ( gasAmount + gas <= fuelTank)  {
            return 0U
        }
        else{
            left = (gasAmount + gas) - fuelTank
            return left
        }
    }

    fun SetFuelTank(gas: UInt) {
        fuelTank = gas
    }

    fun GetFuelTank(): UInt {
        return fuelTank
    }

    fun SetAmoutGas(gas: UInt) {
        gasAmount = gas
    }
    fun GetAmoutGas(): UInt {
        return gasAmount
    }

    fun SetGasPerHundredKM(gas: UInt) {
        gasPerHundredkm = gas
    }

    fun GetGasPerHundredKM(): UInt {
        return gasPerHundredkm
    }

    fun SetMileage(km: UInt) {
        mileage = km
    }

    fun GetMileage(): UInt {
        return mileage
    }

}