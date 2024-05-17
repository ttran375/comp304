class Lamp {
    // property (data member)
    private var isOn: Boolean = false

    // member function to turn on the lamp
    fun turnOn() {
        isOn = true
    }

    // member function to turn off the lamp
    fun turnOff() {
        isOn = false
    }

    // member function to display light status
    fun displayLightStatus(lamp: String) {
        if (isOn) {
            println("$lamp lamp is on.")
        } else {
            println("$lamp lamp is off.")
        }
    }
}

fun main(args: Array<String>) {
    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1") // should print "l1 lamp is on."
    l2.displayLightStatus("l2") // should print "l2 lamp is off."
}
