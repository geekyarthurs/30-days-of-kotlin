class Rectangle(var width: Int, var height: Int){

    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = (width * height)
}



fun main(){

    val r = arrayOf(Rectangle(10,20), Rectangle(30,30))

    for((i,v) in r.withIndex()){

        println("Rectangle $i has Area ${v.area} and is${if(v.isSquare) "" else "not"} square.")
    }

}