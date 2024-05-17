fun main(args: Array<String>) {
    // val number1: Int = 259
    // val number2: Byte = number1.toByte() // Conversion truncates to the least significant 8 bits
    // println("number1 = $number1") //number1 = 259
    // println("number2 = $number2") //number2 = 3

    // val a = -12
    // val b = 12

    // // Use of greater than operator
    // val max = if (a > b) {
    //     println("a is larger than b.")
    //     a
    // } else {
    //     println("b is larger than a.")
    //     b
    // }

    // println("max = $max")

	// val score = 12.3
    // println("score")
    // println("$score")
    // println("score = $score")
    // println("${score + score}")
    // println(12.3)  
    
    // print("Enter text: ")
    // val stringInput = readLine()
    // println("You entered: $stringInput")

    // val number = -10
    // val result = if (number > 0) "Positive number" else "Negative number"
    // println(result)
    
    // val a = 12
    // val b = 5
    // println("Enter operator either +, -, *, or /")
    // val operator = readLine()

    // val result = when (operator) {
    //     "+" -> a + b
    //     "-" -> a - b
    //     "*" -> a * b
    //     "/" -> if (b != 0) a / b else "Division by zero is not allowed"
    //     else -> "$operator is an invalid operator."
    // }

    // println("result = $result")

    // // Iterating from 1 to 5
    // print("for (i in 1..5) print(i) = ")
    // for (i in 1..5) print(i)
    // println() // Output: 12345

    // // Attempting to iterate from 5 to 1 using '..' (will not work as expected)
    // print("for (i in 5..1) print(i) = ")
    // for (i in 5..1) print(i)
    // println() // Output: (prints nothing because 5..1 is an empty range)

    // // Iterating from 5 down to 1 using 'downTo'
    // print("for (i in 5 downTo 1) print(i) = ")
    // for (i in 5 downTo 1) print(i)
    // println() // Output: 54321

    // // Iterating from 1 to 5 with a step of 2
    // print("for (i in 1..5 step 2) print(i) = ")
    // for (i in 1..5 step 2) print(i)
    // println() // Output: 135

    // // Iterating from 5 down to 1 with a step of 2
    // print("for (i in 5 downTo 1 step 2) print(i) = ")
    // for (i in 5 downTo 1 step 2) print(i)
    // println() // Output: 531

    // fun main(args: Array<String>) {
    //     println(getName("John", "Doe"))
    // }
    
    // fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

    fun displayBorder(character: Char = '=', length: Int = 15) {
        for (i in 1..length) {
            print(character)
        }
        println()  // To move to the next line after printing the border
    }
    
    fun main(args: Array<String>) {
        
    }
    
}
