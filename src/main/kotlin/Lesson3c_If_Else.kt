//If else
fun main(){
    var number=-2
    if (number >=0){
        println("Number is zero or negative number")

    }
    else println("Number is negative")

    var marks= 70
    if (marks >40){
        println("Student failed")
    }
    else println("Student passed")

    //elif
    //more than one condition to check
    if (marks <40) println("Fail")
    else if (marks >=40 && marks <50) println("Grade D")
    else if (marks >=50 && marks <60) println("Grade C")
    else if (marks >=60 && marks <70) println("Grade B")
    else if (marks >=70 && marks <=100) println("Grade A")
    else println("Invaid Marks")

}