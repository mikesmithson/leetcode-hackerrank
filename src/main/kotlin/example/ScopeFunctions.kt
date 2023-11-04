package example

class ScopeFunctions {

    fun let(theList: MutableList<String>) {
        theList
            .map { it.length }
            .filter { it > 3 }.let {
                println(it)
            }
    }
}


