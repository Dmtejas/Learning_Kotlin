fun main() {
    var obj: Practice = Practice("Tejas", "Gowda")
    obj.firstName = "Tejas"
    println(obj.firstName)
}

class Practice(firstName: String, private var lastName: String) {
    var firstName = firstName
        get () {
            return "First name : ${field}"
        }
        set (value) {
            field = value
            println("Value set successfully")
        }

}