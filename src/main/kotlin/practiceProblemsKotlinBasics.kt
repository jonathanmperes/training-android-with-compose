fun main() {
    defaultParameters()
}

fun defaultParameters() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(operatingSystem = secondUserOperatingSystem, emailId = secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_third@gmail.com"

    println(displayAlertMessage(operatingSystem = thirdUserOperatingSystem, emailId = thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId:String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}

fun mathOperation() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(numberOne = firstNumber, numberTwo = secondNumber)
    val anotherResult = add(numberOne = firstNumber, numberTwo = thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val newResult = subtract(numberOne = firstNumber, numberTwo = secondNumber)
    val newAnotherResult = subtract(numberOne = firstNumber, numberTwo = thirdNumber)

    println("$firstNumber - $secondNumber = $newResult")
    println("$firstNumber - $thirdNumber = $newAnotherResult")
}

fun subtract(numberOne: Int, numberTwo: Int) = numberOne - numberTwo

fun add(numberOne: Int, numberTwo: Int) = numberOne + numberTwo

fun stringConcatenation() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun stringTemplate() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}

fun messageFromFriend() {
    println("New chat message from a friend.")
}

fun printMessages() {
    println(
        """
            Use the val keyword when the value doesn't change.
            Use the var keyword when the value can change.
            When you define a function, you define the parameters that can be passed to it.
            When you call a function, you pass arguments for the parameters.
        """.trimIndent()
    )
}
