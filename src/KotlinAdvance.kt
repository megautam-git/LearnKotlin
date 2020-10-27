class KotlinAdvance {
    fun learnMap() {
        val list: List<Int> = listOf(1, 4, 2, 7, 13, 6)
        val check1: Boolean = list.all { it > 10 }
        println(check1)
        val check2: Boolean = list.any { it > 10 }
        println(check2)
        val check3: Int? = list.find { it > 10 }
        println(check3)
        val check4: Int = list.count { it > 10 }
        println(check4)
        val mylist = list.filter { it % 2 == 0 && it > 4 }.map { it * 2 }
        for (i in mylist) {
            println("element  divisble by 2= ${i}")
        }
    }
}


fun main() {
    val kotlinAdvance = KotlinAdvance()
    kotlinAdvance.learnMap()
}