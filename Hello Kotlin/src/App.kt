fun main(){

    val arr1 = arrayOf("mahesh" , "prakhyat" , "rochak", "saroj")
    val arr2 = arrayOf("sfucks","weds","loves","proposes")
    val arr3 = arrayOf("sanjiuta","mia","valu","mamamia")


    for(i in 1..3){


        println("${arr1[(Math.random() * 4).toInt()]} ${arr2[(Math.random() * 4).toInt()]} ${arr3[(Math.random() * 4).toInt()]}")
    }


}