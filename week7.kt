fun main(){
    ReverseDigit()
}
fun ReverseDigit() {
    println("Result of Reversed digit is:")
    val arrOfNum: Array<Int> = arrayOf(7,9,5,8,4,3)
    for (i in arrOfNum.size - 1 downTo 0){
        print(arrOfNum[i])
    }
}