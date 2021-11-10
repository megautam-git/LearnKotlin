import java.util.*

class StringPermutation {
    companion object {

        fun calculate(str: String, left: Int, right: Int) {

            if (left == right) {
                println(str)
            } else {
                for (i in left..right) {
                    val swapped: String = swap(str, left, i)
                    calculate(swapped, left + 1, right)
                  // swap(str,left,i)
                }

            }
        }

        fun swap(s: String, i: Int, j: Int): String {
            val temp: Char
            val arr: CharArray = s.toCharArray()
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
          //  println("value${java.lang.String.valueOf(arr)}")
            return java.lang.String.valueOf(arr)
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    val n: Int = str.length - 1
    StringPermutation.calculate(str, 0, n)

}