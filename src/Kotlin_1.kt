import kotlin.reflect.typeOf


// ----------------------------- Android Development using Kotlin --------------------------//

//Hello world in kotlin

/*
fun main() {
    println("Hello world!!")
}
*/



fun main(args: Array<String>) {
    /*
    //Variables in kotlin
    //1) Read-only variables (val)
    //2) Mutable ones (var)
    val number = 20
    var name = "Door"
    name += " Darshan"
    println("Your name : $name age : ${number + 1}") // ----> This is allowed
    //number += 20 -----> This is not allowed
    */


    /*
    //Different Data types in kotlin
    //1) Integer
    val num: Int = 30
    println(num);

    //2) Unsigned integer
    val unum: UInt = 200u;
    println(unum)

    //3) Float and double
    val fnum: Float = 2.3f
    val dnum: Double = 2.45
    println("$fnum $dnum")

    //4) Boolean
    val isTrue: Boolean = true
    println(isTrue)

    //5) String
    val str: String = "AB De Villiers" //' ' for characters
    println(str)
    */

    //Collections

    /*
    //1) Lists (Read only or MutableList)
    val readOnlyList = listOf("Orange","Mango","Banana")
    println(readOnlyList)

    //Mutable list
    val numbers: MutableList<String> = mutableListOf("1","2","3","4")
    val listNumbers: List<String> = numbers
    println(listNumbers.size)

    //in keyword to check the presence of the element
    println("1" in listNumbers)

    //Add() and remove() method in Lists (Mutable)
    numbers.add(0, "3")
    println(listNumbers)

    numbers.remove("3")
    println(listNumbers)
    */

    //Sets - (Unordered collection of elements)
    /*
    //1) Read-only set using setOf()
    val setNum = setOf(1,2,4,5,6)
    println(setNum)

    //2) Mutable set using mutableSetOf()
    val set: MutableSet<Int> = mutableSetOf(1,234,56,67,78)
    val refSet: Set<Int> = set; //Casting
    set.remove(234)
    println(refSet)

    //Count() - count the number of items in the list
    println("${refSet.count()} items are there in the set")

    //in - keyword to check the existence of an element
    println(1 in refSet)
    */


    /*
    //Maps - Similar to the dictionaries of python ( key : value ) and keys are unique
    //Read - only maps
    val map = mapOf("Name" to "Tejas", "Age" to 17)
    println(map)

    //Mutable Maps
    val mutMap: MutableMap<Any, Any> = mutableMapOf("Name" to "Tejas", "Age" to 17)
    val refMap: Map<Any, Any> = mutMap
    println(refMap)

    //Accessing elements
    println(refMap["Name"])

    //Changing elements
    mutMap["Age"] = 19
    println(mutMap)

    //containsKey() function
    println(refMap.containsKey("Name"))

    //remove() method to remove the element
    mutMap.remove("Name")
    println(refMap)

    println(map.keys)
    println(map.values)
    */

    /*
    //Starting the Android development using kotlin course
    //Declaring the variable
    val num1: Int
    num1 = 10
    println(num1)
    */

    /*
    for (i in listOf(2,34,5,6,6)) {
        println(i)
    }

    println(add(2,3))

    */

    //variables()
    //integerDataType()
    //floatDataType()
    //charBool()
    //operators()
    //nullDemo()
    //functionDemo()
    //loopsDemo()
    //challengeMain()
    //arrayDemo()
    arrayChallenge()
}


fun add(n1: Int, n2: Int): Int {
    return n1+n2
}

fun variables() {
    val name = "Tejas" //Constant
    println("Constant : $name")
    var userName = "John"
    println(userName)
    userName = "AB De Villiers"
    println(userName)
}

fun integerDataType() {
    //Maximum to Minimum ranges of the Whole number datatype
    println("Long : ${Long.MAX_VALUE} to  ${Long.MIN_VALUE}")
    println("Byte : ${Byte.MAX_VALUE} to ${Byte.MIN_VALUE}")
    println("Short : ${Short.MAX_VALUE} to ${Short.MIN_VALUE}")
    println("Integer : ${Int.MAX_VALUE} to ${Int.MIN_VALUE}")
    val myNumber = 28L //---> Initialization of a long number
    val num: Short = 28 //----> Initialization of a short number
}

fun floatDataType() {
    println("Float : ${Float.MAX_VALUE} to ${Float.MIN_VALUE}")
    println("Double : ${Double.MAX_VALUE} to ${Double.MIN_VALUE}")
    //Initialization of Float and Double
    val floatValue = 28.56F
    val doubleValue = 28.0
    println("Float value : $floatValue Double value : $doubleValue")
}

fun charBool() {
   //println("Char : ${Char.MAX_VALUE} to ${Char.MIN_VALUE}")
    val char = 'A'
    println("Char : $char")
    val isPrime = true
    if(isPrime) {
        println("It is prime number")
    } else {
        println("It is not a prime number")
    }
}

fun operators() {
    val num1 = 5
    val num2 = 10

    //Arithmetic operators - ( +, -, *, /, %)
    println("Addition : ${num1 + num2}")
    println("Subtraction : ${num1 - num2}")
    println("Multiplication : ${num1 * num2}")
    println("Division : ${num1 / num2}")
    println("Modulo : ${num1 % num2}")

    //Kotlin supports ShortHand Operators
    //{ +=, -=, *=, /=...... }

    //Increment and Decrement Operator
    var number = 20
    println("Pre-Increment : ${++number}")
    println("Post-Increment : ${number++}")
    println("After Post Increment : $number")

    println("Pre-Decrement : ${--number}")
    println("Post-Decrement : ${number--}")
    println("After Post Decrement : $number")

    //Relational Operators - ( > , < , <=, >=, !=, == )
    //Logical Operators - ( &&, ||, ! )
    val num = 30
    if(num == 20 && num <= 40) {
        println("True")
    } else {
        println("False")
    }

}

fun nullDemo() {
    val num: String?  = "Pavi"
    //println(num.length) ---> You need to ensure the nullness
    /*
    if(num != null) {
        println("Length : ${num.length}")
    } else {
        println("Can't calculate the length")
    }
    */

    //?. --> It does a operation when it is not null otherwise print null
    //!!. --> Same as ?. but it also throws exception if it is null
    println(num!!.length)
    println(num?.length)

    //Elvis operator - ?:
    val text: String? = null
    var text1: String? = text ?: "My Name"
    println(text1)

    //What exactly elvis operator does
    if(text != null) {
        text1 = text
    } else {
        text1 = "My Name"
    }
    println(text1)
}


//All About functions
fun functionDemo() {
    greet("Tejas")
    println(addition(2,3))
    println(addition(2.5,6.7))
    println(addition(2))
    sendMessage("Tejas", "I'm fine")
    sendMessage(name = "Tejas", age = 17)
    println(sum(5,6,7,10))
    println("Sum of numbers : ${summation(2,3,4,5,7,8,9,6,5,4)}")
    subtraction(3,4,6,7,4,3,4,5,5)
}

fun greet(name: String) {
    println("Hello $name")
}

//Functions are mainly used to achieve code reusability

//Function with parameter and return type
fun addition(a: Int, b: Int) : Int {
    println("Inside two Int type parameter function")
    return a+b
}


//Function Overloading
fun addition(a: Double, b: Double) : Double {
    println("Inside Double type two parameter function")
    return a+b
}

//Overloading with different parameters
fun addition(a: Int) : Int {
    println("Inside Single parameter function")
    return a;
}

//Function with default parameter
fun sendMessage(name: String, message: String = "Hello") {
    println("The message $message is sent to $name")
}

//Function with named parameters
fun sendMessage(name: String, age: Int) {
    println("Hello $name you are $age years old")
}

//Vararg keyword --> IMP
fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a+b+c+d
}

//Calculating sum of n values
//in -----> Keyword is used to access the vararg elements (Just like in PYTHON)
fun summation(vararg nums: Int) : Int {
    var result: Int = 0
    for(num in nums) {
        result += num
    }
    return result
}

//ForEach loop demo
fun subtraction(vararg list : Int) {
    //list.forEach(fun (ele: Int) = println(ele))
    list.forEach { println(it)}
}


//LOOPS IN KOTLIN - Executing the instructions until the condition is true
fun loopsDemo() {
    println("Welcome to Loops")
    //For Loop
//    for(i: Int in 1..10) {
//        println("i = $i")
//    }

//    for(i in 1 until 10) {
//        println(i)
//    }

//    for(i in 10 downTo 0) {
//        println(i)
//    }

//    for(i in 1 until 10 step 2) {
//        println(i)
//    }

//    for(i in 1..10) {
//        println(i)
//    }

    //While Loop
    val age: Int = 18;
    var i: Int = 0;
    while(i < age) {
        println(i)
        i++
    }
    var j: Int = 0;
    do {
        println("Hii")
        j++
        if(j == 6) {
            println("Bye")
            break
        }
    } while(true)

    //Break and Continue
    var k: Int = 0;
    while(true) {
        println("K : $k")
        if(k == 5) {
            println("Breaking")
            break
        }
        k++
    }
    //Break ---> It terminates the execution of the block
    //Continue ---> It skips the execution of the current iteration

    //  .. --> It exactly acts as range() in python which can be used in if as well
    //outer@ keyword

    var m: Int = 0
    outer@ while(true) {
        println("Inside outer loop")

        while(true) {
            println("Inside inner loop")
            if(m == 5) break@outer
            m++
        }

    }

}

fun challengeMain() {
    println("Total even numbers : ${isEven(2,3,5,6,7,3,56,78,5,4,3,5,67,6)}")
}

fun isEven(vararg nums: Int): Int {
    var flag: Int = 0
    for(num in nums) {
        if(num % 2 == 0) {
            flag++
        }
    }
    return flag
}

//Arrays - Important concept
fun arrayDemo() {
    val arr = arrayOf(1,2,3,5,6,7,8,6,"names")
    arr[0] = 20
    println(arr[0])
    for(i in arr) {
        println(i)
    }

    //Size of the array
    println("Size of the array is ${arr.size}")
    //Array ---> Also allows mixed element


    val array = arrayOf("AB",1,23,4,6,7,8)
    for(num in array) {
        if(num is Int) {
            println(num)
        }
    }


    //Lists
//    val list: List<Any> = listOf("Tejas", 0, "AB")
//    list.forEach { println(it)}
//    val mutList: MutableList<Any> = mutableListOf(2,4,6,7,8,3)
//    val mutNonChange: List<Any> = mutList
//    for(i in mutNonChange) {
//        println(i)
//    }

}

fun arrayChallenge() {
    val arr: Array<Int> = arrayOf(2,3,4,5,6,3,2,67,54,3,2,34)
    println("Maximum element in the given array : ${max(arr)}")
    println("Minimum element in the given array : ${min(arr)}")
}

fun max(numbers: Array<Int>) : Int {
//    var max: Int = Int.MIN_VALUE
//    for(i in numbers) {
//        if(i > max) {
//            max = i
//        }
//    }
//    return max
    return numbers.max()
}

fun min(numbers: Array<Int>) : Int {
//    var min: Int = Int.MAX_VALUE
//    for(i in numbers) {
//        if(i < min) {
//            min = i
//        }
//    }
//    return min
    return numbers.min()
}


