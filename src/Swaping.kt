class Swaping {
    fun swap(a: Int, b: Int) {
        var a = a
        var b = b
        a = a + b
        b = a - b
        a = a - b
        println("value of a$a value of a$b")
    }
}

fun main() {
    val swaping=Swaping()
    var a:Int=12
    var b:Int=10
    swaping.swap(a,b)
}