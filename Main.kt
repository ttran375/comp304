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

    val n = -1
    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than -3.")
        else -> println("n does not meet any specific condition.")
    }
    
}
