package `opp basic`

class student {
    var name: String = ""
    var id: Int = 0
    var address: String = ""

    constructor()

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, id: Int) {
        this.name = name
        this.id = id
    }

    constructor(name: String, id: Int, address: String) {
        this.name = name
        this.id = id
        this.address = address
    }

    fun display() {
        println("Name: $name")
        println("ID: $id")
        println("Address: $address")
    }
}