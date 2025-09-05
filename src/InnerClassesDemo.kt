fun main(args: Array<String>) {
    val obj = InnerClassesDemo(arrayOf("Tejas", "Fruit", "Veg"))
    val innerObj = obj.ListViewItems()
    innerObj.displayItem(2)
}

class InnerClassesDemo(var items: Array<String>) {

    lateinit var name: String;
    //The beauty of inner classes is that it can access the attributes and methods of the class in which it is inside in
    inner class ListViewItems() {
        fun displayItem(position: Int) {
            println("Initializing the name : ");
            name = "Tejas";
            println("Name : $name")
            println(items[position])
        }
    }
}