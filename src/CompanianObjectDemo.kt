fun main(args: Array<String>) {
    val obj = CompanianObjectDemo()
    println(obj.sum(2, 5))
}

class CompanianObjectDemo() {


    fun sum(a: Int, b: Int): Int {
        return a+b
    }


}