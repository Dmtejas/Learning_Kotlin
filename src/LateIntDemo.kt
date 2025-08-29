fun main(args: Array<String>) {
    val obj = LateIntDemo("Tejas", "gowda",17)
    obj.setMovie("Interstellar")
}


class LateIntDemo(var firstName: String, var lastName: String, var age: Int) {
    //It is simply declaring it and initializing it later
    //But we need to initialize it later otherwise exception
    //It does not work with primitive types
    private lateinit var favoriteValue: String
    //Secondary constructor
    constructor(firstName: String, age: Int) : this(firstName, "None", age) {
        println("Constructor is called")
    }
    fun setMovie(movie: String) {
        this.favoriteValue = movie
    }
}

