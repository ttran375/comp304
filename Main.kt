// Lambda expression with type annotation
val sum1 = { a: Int, b: Int -> a + b }

// Lambda expression without type annotation, but with explicit function type
val sum2: (Int, Int) -> Int = { a, b -> a + b }

fun main(args: Array<String>) {
    val result1 = sum1(2, 3)
    val result2 = sum2(3, 4)
    
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")
    
    // Directly print the return value of lambda without storing in a variable
    println("The sum of two numbers is: ${sum1(5, 7)}")
}
