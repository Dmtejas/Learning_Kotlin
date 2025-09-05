fun main(args: Array<String>) {
    val obj: Vehicle = Car1("Ford", "Blue", 5, 6)
    obj.move()
}

//First make a generic class when you know for sure that the classes will inherit them

open class Vehicle(var name:  String, var color: String) {
    open fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car1(name: String, color: String, var noOfEngines: Int, val doors: Int) : Vehicle(name, color) {

    @Override
    override fun move() {
        println("Car is moving")
    }
//    fun move() {
//        println("$name is moving")
//    }
//
//    fun stop() {
//        println("$name has stopped")
//    }
}

class Plane(var noOfEngines: Int, val doors: Int) {
//    fun move() {
//        println("$name is moving")
//    }
//
//    fun stop() {
//        println("$name has stopped")
//    }
}