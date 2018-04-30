fun main(args: Array<String>) {
    val keys = HashMap<String, String>()
    while (true) {
        println("Select mode:\n\t1 - Insert/replace element\n\t2 - Remove element by key\n\t3 - Remove element by value\n\t4 - Search")
        val mode = readLine()
        if (mode == "1") {
            print("Key:")
            val key = readLine()
            print("Value:")
            val value = readLine()
            if (key!!.isEmpty() || value!!.isEmpty()) {
                println("Enter correct key and value!")
                continue
            }
            println(key + " " + value)
            keys[key] = value
        }
        else if (mode == "2") {
            print("Key:")
            val key = readLine()
            if (key!!.isEmpty()) {
                println("Enter correct key!")
                continue
            }
            keys.remove(key)
        }
        else if (mode == "3") {
            print("Value:")
            val value1 = readLine()
            if (value1!!.isEmpty()) {
                println("Enter correct value!")
                continue
            }
            for ((key, value) in keys.entries) {
                if (value == value1)
                    keys.remove(key)
            }
        }
        else if (mode == "4") {
            print("String to search:")
            val s = readLine()
            if (s!!.isEmpty()) {
                println("Enter correct string!")
                continue
            }
            for ((key, value) in keys.entries) {
                if (key.contains(s) || value.contains(s))
                    println(key + "   " + value)
            }
        }
    }
}