fun main() {
    val greeting = birthdayGreeting(name = "Kurt", age = 8)
    println(greeting)

    println(birthdayGreeting(name = "Phoebe", age = 5))
    println(birthdayGreeting(age = 4))
}

fun birthdayGreeting(name: String = "Venice", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}