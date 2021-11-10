import java.util.*

class Billing {
    fun printTitles() {
        val todayDate = Date()
        System.out.printf("_______________________________________")
        System.out.printf("\n\t\t\tInvoice 1")
        System.out.printf("\n\t\t\t\t%td-%<tb-%<tY", todayDate)
    }

    fun printHeaders() {
        System.out.printf("\n---------------------------------------")
        System.out.printf("\n| ID |\t\t\tDESC\t\t|\tAMT\t  |")
        System.out.printf("\n---------------------------------------")
    }

    fun printRows(id: String?, desc: String?, fee: Int) {
        System.out.printf("\n| %s | %.20s| %,8d|", id, desc, fee)
        System.out.printf("\n---------------------------------------")
    }

    fun printResult() {
        System.out.printf("\n|\t   Sub Total\t\t      %,8d|", 10000)
        System.out.printf("\n---------------------------------------")
        System.out.printf("\n|\t   Tax(5%%)\t\t\t\t  %,8d|", 234)
        System.out.printf("\n---------------------------------------")
        System.out.printf("\n|\t   Total\t\t\t\t   %,4d|", 10234)
        System.out.printf("\n---------------------------------------")
        System.out.printf("\n\t\t\t\tTHANK YOU!")
        System.out.printf("\n_______________________________________")
    }
}
fun main(){
    val billing=Billing()
    billing.apply {
        printTitles()
        printHeaders()
        printRows("store","total bill ",1234)
        printResult()
    }
}