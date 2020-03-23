class Dog(val name:String, var age:Int, val breed: String){

    fun bark(){
        println(if (age > 1) "Yip!" else "Bau hau")
    }


}

class Song(val title: String, val artist: String){

    fun play() = println("Playing the song $title by $artist")

    fun stop() = println("Stopped Playing $title by $artist")

}

class DrumKit(var hasTopHat: Boolean, var hasSnare : Boolean){

    fun playSnare() = if (hasSnare) println("Xisss") else print("")

    fun playTopHat() = if (hasTopHat) println("Toock") else print("")


}

class Person(val firstName: String, val lastName: String, age: Short){

    val fullName = firstName.capitalize() + lastName.capitalize()

    var age: Short = age
        set(value){
            if (value > 0) field = value
        }
        get(){
            return field
        }

    init{
        this.age = 300
    }






}


fun main(){

    var me = Person(firstName = "Mahesh", lastName = "Regmi", age = -13)

    me.age = -30

    print(me.age)

    var husky: Dog = Dog(name= "Husky", age = 32, breed = "American")

    husky.bark()


    var songs: Array<Song> = arrayOf<Song>(Song("Mocking Bird","Eminem"), Song("Alpha Omega",  "Machine Gun Kelly"))

    songs[0].play()


    var drumKit: DrumKit = DrumKit(true, false)
    drumKit.playSnare()
    drumKit.playTopHat()





}