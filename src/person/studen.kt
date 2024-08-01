package person

class studen:person {
    override var name: String=""


    override fun sleep() {
        println("$name is sleeping")
    }

    override fun work() {
        println("$name is playig footbal")
    }

    override fun study() {
        println("$name is kawsar ghumai")
    }
}