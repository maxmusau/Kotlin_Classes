//functions
fun main(){
//    main functionn is the entry point (where the execution of the code starts)
    //In-buit functions = println(), print(),readLine(),sum(),compareTo
    //User-defined functions =BMI(),Area()
    //the user defined functions must be called inside the main function
    //sum of numbers in an array
    val sum= arrayOf(12,23,45).sum()
    println("The sum  $sum")
    //compare two numbers
    val num1=40
    val num2=50
    //num1>num2
    var result = (50 >40)
    println(result)
    val answer =num2.compareTo(num1)
    println(answer)
    //rem
    val modulus=num2.rem(num1)
    println(modulus)

}