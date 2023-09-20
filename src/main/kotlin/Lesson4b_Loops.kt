import java.util.*

//Kotlin Loops
fun main(){
    //iterative statements (repetitive)
//    for loop
    //iterate through a collection of items,range,strings
    var name="Modcom is a school"
    for (letter in name)println("$letter Looping")
//    loop through a range using keyword 'in'
    for (number in 0..9)println("$number Looping")
    for (letter in 'a'..'z'){
        if (letter =='a' || letter =='e' ||
            letter =='i' || letter =='o' ||letter =='u') {
//            println("The vowels are:")
            print(" $letter")
        }
    }
    //collection of items
    val players= listOf("Mount","Rice","Ederson","Foden")
    for (player in players){
        println(player)
    }

    //while
    //execute a statement while the condition is true
    var count =0
    while (count <=10){
        println("$count Looping")
        //increament value of count
        count++
    }
    count=1
    while (count <=5){
        val scanner = Scanner(System.`in`)
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
        count++
    }



}