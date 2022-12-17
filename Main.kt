import java.util.Scanner

fun main(args: Array<String>) {
    println("Welcome to the Kotlin Calculator!")
    buildCalculator()
}


fun buildCalculator() {
    var myCalculator = Calculator()

    var loop_condition = "yes"
    while(loop_condition == "yes")
    {
        println("What type of operation would you like to perform?")
        println("These are your options: addition, subtraction, multiplication, division: ")
        var response = readln()


        if (response == "addition") {
            var additionPair = readInput()
            myCalculator.num1 = additionPair.first
            myCalculator.num2 = additionPair.second
            println("Sum: ${myCalculator.add()}")

        }


        if (response == "subtraction") {
            var subtractionPair = readInput()
            myCalculator.num1 = subtractionPair.first
            myCalculator.num2 = subtractionPair.second
            println("Difference: ${myCalculator.subtract()}")

        }


        if (response == "multiplication") {
            var multiplicationPair = readInput()
            myCalculator.num1 = multiplicationPair.first
            myCalculator.num2 = multiplicationPair.second
            println("Difference: ${myCalculator.multiply()}")

        }


        if (response == "division") {
            var divisionPair = readInput()
            myCalculator.num1 = divisionPair.first
            myCalculator.num2 = divisionPair.second
            var division = myCalculator.divide()
            if (division == 0f) {
                print("Error: Zero division, EXITING PROGRAM!")
                return
            } else {
                println("Quotient: ${division}")
            }
        }
        println("")
        println("Would you like to perform another operation? (Options ~ yes or no): ")
        loop_condition = readLine()!!

    }
}


fun readInput() : Pair<Float, Float> {

    println("Enter the first number: ")
    val read = Scanner(System.`in`)
    var num1 = read.nextFloat()

    println("Enter the second number: ")
    var num2 = read.nextFloat()


    return Pair(num1, num2)
}