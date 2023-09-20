import javax.sound.sampled.ReverbType

//Object Oriented Programming
//Objects ,Properties, functions(methods)
//kotlin class
class Car{
//    properties
    //brand,model,milage,YoM,CC,Color
    var brand=""
    var model=""
    var milage =""
    var YOM=""
    var CC=""
    var color=""
    //functions
    //drive,stop,reverse,start
    fun Drive(){
        println("Driving $brand is the best thing that happened to me")
    }
    fun Start(){
        println("$brand Started")
    }
    fun  Reverse(){
        println("$brand Reversed")
    }
    fun Stop(){
        println("$brand Stopped")
    }
}
fun main(){
//    instantiate the object -create variable to represent object
    var car_object=Car()
    car_object.brand="BMW"
    car_object.model="X5"
    car_object.milage="1000 km"
    car_object.YOM="2016"
    car_object.CC="3000"
    car_object.color="Black"
    //call one function
    car_object.Start()
    car_object.Drive()
    //print the properties
    println("Brand ="+car_object.brand)
    println("Milage ="+car_object.milage)
    println("Year of Manufacture ="+car_object.YOM)
    println("CC ="+car_object.CC)
    println("Color ="+car_object.color)


}