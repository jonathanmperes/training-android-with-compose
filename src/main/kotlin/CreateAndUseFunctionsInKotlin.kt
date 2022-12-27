fun main() {
    val greeting = birthdayGreeting(name = "Kurt", age = 8)
    println(greeting)

    println(birthdayGreeting(name = "Phoebe", age = 5))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}