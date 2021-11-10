sealed class Employee

    data class  Manager(val name:String,val desigantion:String):Employee()
    class Junior_developer(val salary:Int):Employee()
    object notice:Employee()
