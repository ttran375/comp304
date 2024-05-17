class Lamp {
    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }
}

fun main(args: Array<String>) {
    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class

    // Test the Lamp class
    l1.turnOn()
    println("Lamp l1 is on: ${l1.isOn()}")

    l2.turnOff()
    println("Lamp l2 is off: ${l2.isOn()}")
}
