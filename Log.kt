fun main(args: Array<String>) {
    val p1 = AuthLog("Bad Password")
}

open class Log {
    var data: String
    var numberOfData: Int

    constructor(_data: String) {
        data = _data
        numberOfData = 0
    }

    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
    }

    init {
        println("$data: $numberOfData times")
    }
}

class AuthLog : Log {
    constructor(_data: String) : this("From AuthLog -> " + _data, 10) {
    }

    constructor(__data: String, _numberOfData: Int) : super(__data, _numberOfData) {
    }
}
