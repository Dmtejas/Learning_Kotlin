fun main(args: Array<String>) {
//    val obj = CompanianObjectDemo()
//    println(obj.sum(2, 5))
    val res: Int = CompanianObjectDemo.sum(2, 6)
    println(res)
}

class CompanianObjectDemo() {
    //It is an object where, It allows us to access the properties of the class without creating an object

    companion object {
        fun sum(a: Int, b: Int): Int {
            return a+b
        }
    }

}