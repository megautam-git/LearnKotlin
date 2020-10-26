class UseofLazy {
    var name:String?=null
    var type:String?=null
}
/*also and let uses it and apply  and run can declared directly */
fun main() {
    val useofLazy:UseofLazy by lazy {
        UseofLazy()
    }
    useofLazy.let {
        it.name="gautam singh"
        it.type  = "kotlin developer"
    }

    with(useofLazy){
        println(this.name)
        println(this.type)
    }



    useofLazy.also {
        it.name="shankar shekhawat"
        it.type="tester"
    }
    with(useofLazy){
        println(this.name)
        println(this.type)
    }


    useofLazy.apply {
        name="suraja singh"
        type="dhobi"
    }
    with(useofLazy){
        println(this.name)
        println(this.type)
    }


    useofLazy.run {
        name="shivan"
        type="architect"
    }
    with(useofLazy){
        println(this.name)
        println(this.type)
    }
    /*useofLazy.name="gautam"
    useofLazy.type="developer"
    println(useofLazy.name)
    println(useofLazy.type)

    val useofLazy1=UseofLazy().apply {
        this.name="bhagwan prasad"
        this.type="pwds"
    }
    println(useofLazy1.name)
    println(useofLazy1.type)

    val useofLazy2=UseofLazy().let {
        it.name="gautam singh"
        it.type  = "kotlin developer"
        println(it.name)
        println(it.type)
    }


    val useofLazy3=UseofLazy().also {
        it.name="taak"
        it.type="mar 3.0"
        println(it.name)
        println(it.type)
    }
*/

}