fun main() {
    val greeting = birthdayGreeting()
    println(greeting)

    println(birthdayGreeting())
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Roger!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}