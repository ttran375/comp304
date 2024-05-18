open class Person(val age: Int) {
    fun eat() {
        println("Eating...")
    }

    fun talk() {
        println("Talking...")
    }

    fun walk() {
        println("Walking...")
    }
}

class MathTeacher(age: Int) : Person(age) {
    fun teachMath() {
        println("Teaching math...")
    }
}

class Footballer(age: Int) : Person(age) {
    fun playFootball() {
        println("Playing football...")
    }
}

class Businessman(age: Int) : Person(age) {
    fun doBusiness() {
        println("Doing business...")
    }
}

fun main() {
    val mathTeacher = MathTeacher(30)
    mathTeacher.eat()
    mathTeacher.talk()
    mathTeacher.walk()
    mathTeacher.teachMath()

    val footballer = Footballer(25)
    footballer.eat()
    footballer.talk()
    footballer.walk()
    footballer.playFootball()

    val businessman = Businessman(40)
    businessman.eat()
    businessman.talk()
    businessman.walk()
    businessman.doBusiness()
}
