/*
 Enum classes - the directions like NORTH, SOUTH .... are the instances
 */

fun main() {
//    println(Direction.EAST)
//    println(Direction.WEST)
//    println(Direction.SOUTH)
//    println(Direction.NORTH)


    //Looping through enums
    for(direction in Direction.values()) {
        println(direction)
    }

    //Accessing enum constructor attributes
    println(Direction.NORTH.distance)
    Direction.SOUTH.printDetails()

    //Using enums in when statement
    val direction = Direction.EAST;
    when(direction) {
        Direction.EAST -> println("Direction is east")
        Direction.WEST -> println("Direction is east")
        Direction.NORTH -> println("Direction is east")
        Direction.SOUTH -> println("Direction is east")

    }

}

enum class Direction(var direction: String?, var distance: Int) {
    NORTH("north", 12),
    SOUTH("south", 32),
    EAST("east", 34),
    WEST("west", 23);

    fun printDetails() {
        println("Direction : ${direction} Distance : ${distance}")
    }
}
