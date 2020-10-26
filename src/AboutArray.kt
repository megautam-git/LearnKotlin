import java.util.*

class AboutArray {
    companion object{
    fun printArray() {
        val sc = Scanner(System.`in`)
        val arr = arrayOfNulls<String>(4)
        for (i in arr.indices) {
            arr[i] = sc.next()
        }
        for (i in arr.indices) {
            println(arr[i])
        }
    }}
}

fun main() {
  AboutArray.printArray()
}