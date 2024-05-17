fun main(args: Array<String>) {
    val person1 = Person("joe", 25)
}

class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    init {
        firstName = fName.capitalize()
        age = personAge
        println("First Name = $firstName")
        println("Age = $age")
    }
}
