fun main() {

    val options: Array<String> = arrayOf<String>("Rock", "Paper", "Scissors")

    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)

}


fun getGameChoice(options: Array<String>) = options[(Math.random() * options.size).toInt()]


fun getUserChoice(options: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""


    while (!isValidChoice) {

        print("Enter any of the three:")
        for (item in options) print(" $item")
        println(".")

        var userInput = readLine()
        userInput = userInput?.capitalize()

        if (userInput != null && userInput in options) {

            isValidChoice = true
            userChoice = userInput

        }

        if (!isValidChoice) println("Invalid Choice")

    }


    return userChoice


}

fun printResult(userChoice: String, gameChoice: String) {

    val result: String

    if (userChoice.equals(gameChoice)) result = "Tie!"
    else if ((userChoice.equals("Rock") && gameChoice.equals("Scissors")) || (userChoice.equals("Scissors") and gameChoice.equals(
            "Paper"
        )) || (userChoice.equals("Paper") && gameChoice.equals("Scissors"))
    )
        result = "You Win!"
    else result = "You Lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")


}