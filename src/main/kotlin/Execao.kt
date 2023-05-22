

fun main(){

    try {
        val t: String ? =  null
        println(println(t))
    }
    catch (e : NullPointerException){
        println(e.stackTrace)
    }
    catch (e:Exception){
        println(e.stackTrace)
    }

}