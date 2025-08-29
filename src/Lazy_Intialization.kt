/*
Lazy Initializer - It is creating an object without having to execute the initializer block

Syntax --> val object_name by lazy { Give the class }
 */


fun main() {
    val obj = User1("Tejas","Gowda",20)
    val user by lazy {
        User1("Alex","bob",20)
    }

    user.show()
}

class User1(private var firstName: String, private var lastName: String, private var age: Int ) {
    init {
        println("User1: $firstName was created")
    }

    fun show() {
        println("Inside show")
    }
}