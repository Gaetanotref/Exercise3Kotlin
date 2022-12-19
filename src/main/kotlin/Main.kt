fun main(args: Array<String>) {
    val number1 : String = "10"
    val number2 : Float = 10.0f
    val number3 : Int = 10

    println("Is number1 and number2 equals?: ${number1.toFloat() == number2}!")
    println("Is number2 and number3 equals?: ${number2 == number3.toFloat()}!")

}