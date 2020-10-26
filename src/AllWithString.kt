class AllWithString{
     var name:String?=null
}

fun main() {
    val allWithString=AllWithString()
    allWithString.name="dsfds"
    println(allWithString.name)
    val str = "G1autam"
    println(str.endsWith("am"))
    println(str.startsWith("G"))
    println(str.isEmpty())
    println(str.substring(0, 5))



    //blank character value of java
    val ch = Character.MIN_VALUE

    //in string string replace method works with charcters
    println(str.replace(str[1], ch))
    println("index of string" + str.indexOf("1a"))

    //this method find position differnce b/w characters
    println(Character.compare('f', 'e'))
    println(Character.isLetterOrDigit(1))



    //find the unicode
    println(Character.isLowerCase(str[0]))
    val st = StringBuilder(str)
    println(st.append('f'))
    println(st.indexOf(str))

    //in stringbuilder string replace method works with range
    println(st.replace(1, 2, ""))
    println(st.substring(0, 5))
    println(st.subSequence(0, 4))
}