//inheritance
fun main(){
//inheritance -defining the superclass
// and inheriting properties from the super class
    //parent and child class
//    define the class object
var object1=ChildClass()
//    access the function
    object1.Myfunction()
}
//create the super class
open class MyParentClass{
    var x=40
    var name="Modcom"
    var courses= arrayListOf("Web Development","Mobile Development","Data Science")
    var mycourses=courses.toString()
}
//define the child class
class ChildClass:MyParentClass(){
    fun Myfunction(){
        println(x)
        println("Name of school is "+name)
        println("And the courses offered are: "+mycourses)
    }


}
