fun main(args: Array<String>) {
    println("Welcome to my App")
    val guests: Int = 54
    val typeInterface = "Nice"
    println("There are $guests guests here")
    println("This type interface is $typeInterface")
    val alternate = true
    println("If one would ask if I can declare a variable another way, I would say $alternate")
    val counts = 2
    val multiplies = 3
    println("You can multiply numbers like this: ${counts * multiplies}")
    var changingVariable = 1
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)

    println("Say \"hello\"")
    second()

    //val message = birthdayGreeting("Michael")
    print(birthdayGreeting("Alice", 3))
    println(birthdayGreeting(age = 2, name = "Amelia"))
    println(birthdayGreeting(name = "Alexis"))
    println(birthdayGreeting(age = 6))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val subResult = subtract(firstNumber, secondNumber)
    val anotherSub = subtract(secondNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $subResult")
    println("$secondNumber - $thirdNumber = $anotherSub")

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))


    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    print(compareNumbers(firstNumber, secondNumber))



}
    fun second(): Unit {
        println("Cloudy")
        println("Partly Cloudy")
        println("Windy")
        val count: Int = 2
        println(count)

    }

fun birthdayGreeting(name: String = "Stranger", age: Int = 0): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!\n"
    return "$nameGreeting\n$ageGreeting"
}

fun add(first: Int = 0,second: Int = 0): Int {
    return first + second
}

fun subtract(first: Int = 0, second: Int = 0): Int {
    return first - second
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String = "Unknown"): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}

fun compareNumbers(first: Int = 0, second: Int = 0): Boolean {
    return first > second
}




