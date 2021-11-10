class MyData {
    fun count(arr:Array<String>):Int{
        var count:Int?=0;
        for (i in arr.indices){
            count=i;
        }
        return count!!;
    }


}

fun main() {
    val arr=arrayOf("one ","two","three");
    val m=MyData();
    val c=m.count(arr)
    print(c)
}