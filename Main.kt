fun main(args: Array<String>) {
    val number1: Int = 259
    val number2: Byte = number1.toByte() // Conversion truncates to the least significant 8 bits
    println("number1 = $number1")
    println("number2 = $number2")
}
