//functions -user defined
fun main(){
    //call the other functions
//    travel_cost()
//    BMI()
//    var area=area_circle()
//    print(area)
//     var Area_triangle=area_triangle(20,10)
//    println(Area_triangle)
//    var largest=Largest(112,65,78)
//    print(largest)
    val list= listOf(12.0,12.0,12.0)
    val mean=Mean(list)
    println("Mean is $mean")

}
//function that calculates the cost of travelling
fun travel_cost(){
    val distance=50
    val per_km=20
    var total =per_km *distance
    println("Distance travelled = $distance Charges are $total")
}
//create a function to calculate the BMI value of patient x
fun BMI(){
    val weight=40
    val height=1.6
    val bmi= weight/(height *height)
    println("BMI value is $bmi")
}
//functions that return a value
//define the datatype of the variable to be returned when creating the function
fun area_circle():Double{
    val radius=20
    val area=3.14*radius*radius
    return area
}
//functions with parameters
fun area_triangle(base:Int,height:Int):Int{
    val area=(base*height)* 1/2
    return area
}
//largest number out of 3
fun Largest(num1:Int,num2:Int,num3:Int):Int{
    if (num1 >num2 && num1> num3) {
//        var largest = num1
        return num1
    }
    else if (num2 >num3 && num2 >num1) {
//        var largest = num2
        return num2
    }
    else {
//        var largest=num3
        return num3
    }
}
//create a function to return mean of numbers in a list
fun Mean(numbers:List<Double>):Double{
    var count=numbers.size
    var mean=numbers.sum() / count
    return mean
}
//android studio
//Object Oriented Programming

