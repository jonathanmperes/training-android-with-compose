fun main() {
    messageFromFriend()
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
