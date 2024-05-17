class Lamp {
    // property (data member)
    private var isOn: Boolean = false

    // member function to display light status
    fun displayLightStatus() {
        if (isOn) {
            println("Lamp is on.")
        } else {
            println("Lamp is off.")
        }
    }

    // member function to turn on the lamp
    fun turnOn() {
        isOn = true
    }

    // member function to turn off the lamp
    fun turnOff() {
        isOn = false
    }
}

fun main(args: Array<String>) {
    val lamp = Lamp() // create an object of the Lamp class

    // Display the initial status of the lamp
    lamp.displayLightStatus() // should print "Lamp is off."

    // Turn on the lamp and display its status
    lamp.turnOn()
    lamp.displayLightStatus() // should print "Lamp is on."

    // Turn off the lamp and display its status
    lamp.turnOff()
    lamp.displayLightStatus() // should print "Lamp is off."
}
