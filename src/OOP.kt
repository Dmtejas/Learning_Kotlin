//After Understanding the basics of kotlin and how  it works
//Let's move on to OOP Concepts



var demo: Int = 0
    get() {
        println("Returning the value")
        return field
    }
    set(value) {
        println("Setting the value")
        field = value
    }

fun main() {
//    val carObj = Car("Teas") //Object instantiation
//    carObj.move()
//    carObj.stop()

//    val userObj = User("Tejas", "Gowda", 18)
//    userObj.show()

    //Example for named args
//    val computerObj = Computer(modelNum = 8721343, model = "Lenovo")
//    computerObj.show()
//
//    val computerObj2 = Computer("HP","White", 12345)
//    computerObj2.show()

    //Overriding getters and setters
//    val obj: SetGetDemo = SetGetDemo("Tejas", "Gowda")
//    obj.firstName = "Ganavi"
//    demo = 20;
//    println(demo)

//    val obj = Info("Tejas","Gowda",12)
//    obj.favoriteMovie = "Interstellar"
//   // println(obj.favoriteMovie) //This throws an exception

//    val result = Calculator.sum(2,3)
//    println(result)
//    println(Calculator.str)
//    //Best example - Int.MAX_VALUE


    //Whenever we want to create the instance of the class only once

    //One way of doing it
//    val instance = DataBase.getInstance()
//    println(instance)
//    val instance2 = DataBase.getInstance()
//    println(instance2)

    println(Database)


}

//Props can be sent to the classes just like in JavaScript React Library
class Car(private var carName: String) {
    fun move() {
        println("Car is Moving ${this.carName}")
    }
    fun stop() {
        println("Car stopped")
    }

}

//Class with Initializer Block
//class User(name: String, var age: Int) {
//    private var name: String
//    //Initializer block
//    init {
//        if(name.lowercase().startsWith('A')) {
//            this.name = name
//        } else {
//            this.name = "User"
//            println("Name doesn't starts with A")
//        }
//    }
//
//    fun show() {
//        println(this.name)
//    }
//}

//Class with secondary constructors
class User(private var name: String, private var lastName: String, private var age: Int) {
    private var phoneNumber: Int

    init {
        phoneNumber = 0
    }

    constructor(name: String, age: Int, phoneNumber: Int) : this(name,"None", age) {
        this.phoneNumber = phoneNumber
    }
    fun show() {
        println("Name : ${this.name}")
        println("Last Name : ${this.lastName}")
        println("Age : ${this.age}")
    }
}

//Class example with all kinds of constructor
class Computer(private var model: String, private var color: String = "Black", private var modelNum: Int) {
    init {
        println("Inside the initializer block")
    }

    //Secondary Constructor
    constructor(model: String, modelNum: Int) : this(model, "Black",modelNum) {
        println("This is secondary constructor ( CALLED )")
    }

    fun show() {
        println("Model: ${this.model} \nColor: ${this.color} \nModel Number: ${this.modelNum}")
    }
}

//The Main Advantage of Secondary Constructors - Avoid overloading classes
//We can use default values for the properties using Default / Primary

//Getters and setters in kotlin
class SetGetDemo(firstName: String, private var lastName: String) {
    //Encapsulation
    //Getters and setters are implicit in kotlin to assign and access the property
    var firstName = firstName
        get () {
            return field
        }
        set(value) {
            field = value
            println("First name is set")
        }

}

//lateInit ---> Keyword ---> Initialize the object a little later
class Info(var firstName: String, var lastName: String, var age: Int) {
    //Our responsibility to initialize it later otherwise crashes
    lateinit var favoriteMovie: String
    //lateinit var num: Int ---> Not allowed for primitive class
}

class Calculator() {
    companion object {
        val str: String = "String from companion object"
        fun sum(a: Int, b: Int) = a+b
    }
}


//Creating instance only once
class DataBase private constructor() {
    companion object {
        private var instance: DataBase? = null

        fun getInstance(): DataBase? {
            if(instance == null) {
                instance = DataBase()
            }

            return instance
        }
    }
}

object Database {
    init {
        println("Inside the initializer of the database")
    }
}


