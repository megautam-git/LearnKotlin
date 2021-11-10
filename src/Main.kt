/*
import java.util.*

class Main {
    val my_name: String = "gautam singh"
    fun show() {
        println(my_name)
        val myData = MyData()
        println(myData.my_name)
        println("hello gautam")
        println("###################################")
    }
}

data class Student(
        var name: String? = null,
        var roll_no: String? = null
)

fun main() {
    val m = Main()
    m.show()
    val list: MutableList<Student> = ArrayList()
    list.add(Student("gautam", "1"))
    list.add(Student("gautam taneja", "2"))
    list.add(Student("taneja", "3"))

    println("###############method 1############")
    for (st in list) {
        println("${st.name} fdf ${st.roll_no}")
    }

    println("###########method 2##########")
    val li: Iterator<Student> = list.iterator()
    while (li.hasNext()) {
        val st = li.next()
        println("${st.name} ${st.roll_no}")
    }

    println("########method 3##########")
    for (i in list.indices) {
        println(list[i].name + " " + list[i].roll_no)
    }
    //checkig enum
    val employee: Employee = Manager("fdsf", "dfsf");
    val emp_data = when (employee) {
        is Junior_developer -> {
            "klfjsdklfj"
        }
        is Manager -> {
          "work hard to get there"
        }
        notice -> {
            "kldjgljgigjjgkfg hgfgifgbhgg"
        }
    }
    print("jhfjkd${emp_data}")
}

*/
