class Person(val firstName: String, var age: Int)

fun main(args: Array<String>) {
    val person1 = Person("Joe", 25)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
