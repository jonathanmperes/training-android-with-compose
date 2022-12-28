fun main() {
    stringConcatenation()
}

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
