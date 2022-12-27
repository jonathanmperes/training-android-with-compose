fun main() {
    val greeting = birthdayGreeting(name = "Roger")
    println(greeting)

    println(birthdayGreeting(name = "John"))
}

fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}