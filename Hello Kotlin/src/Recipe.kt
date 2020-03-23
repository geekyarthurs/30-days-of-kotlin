data class Recipe(val title: String, val isVegeterian: Boolean)


fun main() {

    val r1 = Recipe("Chicken", false)
    val r2 = Recipe("Chicken", false)
    val r3 = r1.copy(title = "Mutton")

    val (title, veg) = r1

    println("title is $title and food is $veg")


    println(r1.toString())

}