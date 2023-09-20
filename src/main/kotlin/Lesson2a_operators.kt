fun main(){
    //operators
    //Arithmetic Operators
    //+,-,/,*,**
//    Addition
    val length=20
    val width=30
    var perimeter=width +width +length+length
    println("The Perimeter of a rectangle with width =$width and length =" +
            "$length is $perimeter")
    //subtraction
    var num1=40
    var num2=50
    var answer=num2-num1
    println("The difference between $num1 and $num2 is $answer")

    //multuplication
    answer =num1*num2
    println("The product of $num1 and $num2 is $answer")

    //division
    var num3:Double=40.0
    var num4:Double=50.0
    var division:Double=(num4 / num3)
    println("$num4 divide by $num3 is $division")

    //modulus
    var modulus=num2 % num1
    println("The ramainder in $num2 / $num1 is $modulus")
}