abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
     var hunger: Int = 0


    abstract fun makeNoise()

    abstract fun eat()

     open fun roam() {}

    fun sleep() {}


}

class Hippo() : Animal() {

    override val image = "hippo.jpg"
    override val food = "food.jpg"
    override val habitat = "water"

    override fun makeNoise() = println("lmao! grunt !")

    override fun eat()  = println("the hippo is eating $food")

}