import java.util.*

fun main(){
    ReverseDigit()
}
fun ReverseDigit() {
    var num2 = 795843
    var reversed = 0

    while (num2 != 0){
        val digit = num2 % 10
        reversed = reversed * 10 + digit
        num2 /= 10

    }
    val results : Array<Int> = arrayOf(reversed)
    println(Arrays.toString(results))

}
