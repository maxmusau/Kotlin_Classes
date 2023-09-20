//call functions inside other functions
fun main(){
    Calc()
    Personal_details()
}
//user defined functions
fun multiply(num1:Int,num2:Int):Int{
    val result=num1.times(num2)
    return result
}
fun Calc(){
    //multiplication
    val product = multiply(20,30)
    println(product)
    //area of a reactangle
    val length =40
    val width =10
    val area=multiply(length,width)
    println(area)
    val area_circle=area_circle(21.0)
    println(area_circle)
}
//create a function that returns the area of circle and use it inside the Calc function
fun area_circle(radius:Double):Double{
    val area=3.14*radius*radius
    return area
}
//fnction to validate email
fun isEmailValid(email:String):Boolean{
    val emailValid="^[A-Za-z0-9+_.-]+@(.+)\$"
//    regular expression
    return Regex(emailValid).matches(email)
}
fun Personal_details(){
    val email1="user@modcom.com"
    val email2="user_modcom"
//    use if statements to check if email is valid
//    val status=isEmailValid(email1)
    if (isEmailValid(email1)){
        println("Email1 is Valid")
    }
    else{
        println("Email1 is not Valid")
    }
    if (isEmailValid(email2)){
        println("Email2 is Valid")
    }
    else{
        println("Email2 is not Valid")
    }
}