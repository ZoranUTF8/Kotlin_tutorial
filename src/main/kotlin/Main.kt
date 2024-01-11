fun main() {
// TODO    ?. is the safe call operator, and ?: is the Elvis operator.
//    val n1 = readLine()?.toIntOrNull() ?: 1
//    val n2 = readLine()?.toIntOrNull() ?: 2
//    val res = n1 + n2
//    println("You entered: $res")

//    TODO LISTS

//    val shoppingList = listOf("this list is not mutable", "Lambo", "Bmw", "RangeRover")
//    println(shoppingList)

//    val shoppingMutable = mutableListOf("this list is not mutable", "Lambo", "Bmw", "RangeRover")
//    shoppingMutable.add("Ferari")
//    println(shoppingMutable)


//    TODO LOOPS
//    while (true) {
//        val userIn: String = readln()
//        println("You entered: $userIn")
//
//        if (userIn == "exit") break
//    }

//    for ((ind, item) in shoppingMutable.withIndex()) {
//
//        println("Index ${ind + 1} is $item")
//    }
//         RANGE
//    for (i in 1..5) {
//        println("I IS: $i")
//    }

//    TODO WHEN similar to switch
//    val x = 3
//    when(x){
//        in 1..2 -> println("X is between 1 and 2 $x")
//        in 3..10 -> println("X is between 3 to 10 $x")
//        else ->{
//            println("X is  another value which is $x")
//        }
//    }

//    print10Nums()
//
//    val res = isEven(num = 5)
//    println(res)

//    val y = 3
//    println(3.extensionFunctionIsOdd())

//    TODO CLASSES

//    val dog1 = Dog("Tedi")
//    dog1.makeSound()
//
////    Anonymous class
//
//    val bear = object : Animal("Bear name") {
//        override fun makeSound() {
//            println("Bear says roar")
//        }
//    }
//
//    bear.makeSound()
//


//     TODO TRY CATCH
//    try {
//        val inUsr = readLine()?.toInt()
//
//
//    } catch (e: Exception) {
//        println("Check your input")
//    }


//     TODO LAMBDA FUNCTIONS are functions that we pass as a parameter to another function similar tp callback function in js

    val numbers = listOf(1, 2, 3, 4, 5, 3)

// Using lambda function as an argument to 'map'
    val squaredNumbers = numbers.map { it * it }

// Using lambda function as an argument to 'filter'
    val evenNumbers = numbers.filter { it % 2 == 0 }

// Using lambda function as an argument to 'forEach'
    numbers.forEach { println(it) }

    val total = numbers.count { curr -> curr == 3 }

    println(evenNumbers)


//
////     TODO FUNCTIONS
//fun print10Nums() {
//    for (i in 1..10) {
//        println(i)
//    }
//}
//
//fun isEven(num: Int = 10): Boolean {
//    return num % 2 == 0
//}
//
//// TODO Extension functions Kotlin specifics liek Int, String etc...
//fun Int.extensionFunctionIsOdd(): Boolean {
//    return this % 2 == 1
//}

}

