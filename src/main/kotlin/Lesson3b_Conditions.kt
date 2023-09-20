import java.util.Scanner

//Kotlin Conditional statements
fun main(){
    //if statements are used to make decisions
    var number=0
    if (number >0){
        println("Number is positive")
    }
    if (number <0) {
        println("Number is negative")
    }
    if (number == 0){
        println("The number is equal to zero")
    }
    val scanner=Scanner(System.`in`)
    print("Enter marks: ")
    val marks =scanner.nextInt()


    print("Enter student name: ")
    val Student= readln()
    println("$Student scored $marks marks")

}