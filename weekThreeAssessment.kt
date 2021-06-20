fun main(){
    //function that displays 1 to 100 each number in a new line
    count1to100()

    //function of multiples of three
    multiplesOfThree()

    //function of multiples of five
    multiplesOfFive()

    //function of combine multiples of five and three using a logical operation
    multiplesOfFiveAndThree()

    //function that display the reverse of a string supplied without using the reserved function
    reverseOfStringSupplied()

}

fun count1to100(){
    println("Counting 1 to 100 each on a new line, are:")
    for(numbers in 1..100)
        println("$numbers")
}

fun multiplesOfThree(){
    //Multiple of 3 from 1 to 100 displaying Fizz as result for each multiple
    var a = 0
    var b = 3
    for(i in 1..100)
        if(i % b == 0){
            a = a + 3
            println("Fizz")
        }
}

fun multiplesOfFive(){
    //Multiple of 5 from 1 to 100
    var a = 0
    var b = 5
    for(i in 1..100)
        if(i % b == 0){
            a = a + 5
            println("Buzz")
        }
}

fun multiplesOfFiveAndThree(){
    //Multiple of 3 and 5 from 1 to 100
    var a = 0
    var b = 3
    var c = 5
    for(i in 1..100)
        if(i % b == 0 && i % c == 0){
            println("FizzBuzz")
        }
}

fun reverseOfStringSupplied(){
    //To display the reverse of a string supplied
    println("Enter string to be reversed after then Press Enter: ")
    val stringName = readLine()!!

    var result: String = ""
    var lastIndex = stringName!!.lastIndex

    while(lastIndex >= 0) {
        result += stringName[lastIndex]
        lastIndex--
    }
    println("Reversed Result is : ${result.toUpperCase()}")
}