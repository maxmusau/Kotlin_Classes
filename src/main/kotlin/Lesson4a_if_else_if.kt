import java.util.Scanner

fun main(){
    //if else if statements
    //create a program that receives height and weight
// of a person and calculates the BMI
    //Check if the person has normal BMI or not
    val scanner =Scanner(System.`in`)
    print("Enter weight in kgs: ")
    val weight = scanner.nextInt()
    print("Enter height in M: ")
    val height = scanner.nextDouble()

    var BMI =weight / (height *height)
    //use the if statements to check the BMI value
    if (BMI <18.5){
        println("BMI = $BMI class= Underweight")
    }
    else if (BMI >=18.5 && BMI <=22.9)println("BMI = $BMI class= Normal")
    else if (BMI >=23&& BMI <=24.9)println("BMI = $BMI class= Overweight")
    else if (BMI >=25 && BMI <=29.9)println("BMI = $BMI class= Pre-Obese")
    else if (BMI >=30 && BMI <=34.9)println("BMI = $BMI class= Obese Class I")
    else if (BMI >=35 && BMI <=39.9)println("BMI = $BMI class= Obese Class II")
    else if (BMI >=40 )println("BMI = $BMI class= Obese Class II")
}