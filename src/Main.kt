fun main() {
    println("Welcome to Dice Roller!")

    while (true) {
        println("Press 'r' to roll the dice or 'q' to quit:")
        val input = readLine()

        when (input?.lowercase()) {
            "r" -> {
                val diceResult = rollDice()
                println("You rolled a $diceResult!")
            }
            "q" -> {
                println("Thanks for playing! Goodbye!")
                break
            }
            else -> println("Invalid input. Please try again.")
        }
    }
}

fun rollDice(): Int {
    return (1..6).random()
}
