fun main(args: Array<String>) {
    println("person1 is instantiated")
    val person1 = Person("joe", 25)
    println("person2 is instantiated")
    val person2 = Person("Jack")
    println("person3 is instantiated")
    val person3 = Person()

    // Printing the values to show the output as mentioned
    println("Person1: First Name = ${person1.firstName}, Age = ${person1.age}")
    println("Person2: First Name = ${person2.firstName}, Age = ${person2.age}")
    println("Person3: First Name = ${person3.firstName}, Age = ${person3.age}")
}

class Person(__firstName: String = "UNKNOWN", __age: Int = 0) {
    val firstName = __firstName.capitalize()
    var age = __age

    // Initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}
