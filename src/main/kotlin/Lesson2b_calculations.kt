import java.util.Scanner

fun main(){
    //calculations
    //create a program to calculate the area of a triangle
    //display BMI
    val height=1.7
    val weight=50.0
    val BMI=weight /(height*height)
    println("The BMI of person x with height=$height and " +
            "weight =$weight is $BMI")
//    use scanner to allow user input
    print("Enter radius in cm: ")
    var scanner=Scanner(System.`in`)
    val radius=scanner.nextInt()
    val area=3.14 *radius *radius
    println("The area of a circle with radius $radius is $area")

    //program to calculate the simple interest
    print("Enter principle: ")
    var P= scanner.nextInt()
    print("Enter Rate: ")
    val R=scanner.nextInt()
    print("Enter time: ")
    val T=scanner.nextInt()
    val SI=P*R*T /100
    println("Simple Interest of Principle=$P, Time=$T and Rate=$R = $SI")

//    ReadLine- input is a string value
    print("Enter Name: ")
    val name= readLine()
    print("Enter Course: ")
    val course= readLine()
    print("Enter Campus: ")
    val campus= readLine()
    println("My name is $name from $campus studying $course")
    
}