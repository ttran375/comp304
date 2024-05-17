fun main(args: Array<String>) {
    val person = Person()
    println("Initial Name: ${person.name}")
    
    person.name = "Alice"
    println("Updated Name: ${person.name}")
}

class Person {
    var name: String = "defaultValue"
        // getter
        get() = field
        // setter
        set(value) {
            field = value
        }
}
