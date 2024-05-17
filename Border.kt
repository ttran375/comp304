fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
    println()  // To move to the next line after printing the border
}

fun main(args: Array<String>) {
    println("Output when no argument is passed:")
    displayBorder()
    
    println("Output when first argument is passed:")
    displayBorder('*')
    
    println("Output when both arguments are passed:")
    displayBorder('*', 5)
}
