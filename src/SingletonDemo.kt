fun main(args: Array<String>) {
//    val instance = SingletonDemo.createInstance();
//    println(instance)

    //SingleTon using object demo
    Database1.sum();
    val obj = Database1;
    val obj2 = Database1;
    println(obj)
    println(obj2)

    //Lazy initialization
    val obj5 = User3("tejas", "Gowda", 14)
    val obj6 = User3("tejas", "shetty", 19)

    //It ignores the initializer block
    val obj7 by lazy {
        User3("User2","none", 17)
    }

    //Now init {} is called
    obj7.firstName = "ABD"


}



public class User3(var firstName: String?, var lastName: String?, var age: Int) {
    init {
        println("$firstName is created")
    }
}
public class SingletonDemo private constructor() {
    //Singleton is basically used to create only one object or an instance to access the class hich shold be available globally
//    companion object {
//        private var instance: SingletonDemo? = null
//        fun createInstance(): SingletonDemo? {
//            if(instance == null) {
//                instance = SingletonDemo()
//            }
//            return instance
//        }
//    }

    //The above code can be achieved by using object {}

}

object Database1 {
    init {
        println("Hello I am inside object class")
    }
    fun sum() {
        println("Inside sum function")
    }
}