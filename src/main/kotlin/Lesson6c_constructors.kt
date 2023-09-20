//kotlin constructors

//constructors are special functions
// used to initialize the properties of a class when creating the class
class  Personal_computer(var Brand:String,var Model:String,
                         var RAM:Int,var Drive:Int){
//    define methods/functions
    fun Programming(speed:String):String{
        println("The speed of $Brand model $Model is $speed")
        return  speed
    }
//    playing music
    fun Play_music(){
        var quality="High Quality videos"
        println(quality)
    }
}

class Owner(var name:String){
    fun display(){
        println("Owned by $name")
    }
}
fun main(){
//    create an object
    var computer_object=Personal_computer("HP",
        "EliteBook",8,500)
    println(computer_object.Brand)
    computer_object.Programming("2.5Ghz")
    computer_object.Play_music()
//    object for owner clss
    val owner=Owner("Milcah")
    println(owner.name)
    println("Brand= "+computer_object.Brand+ " Model= "+computer_object.Model+
    " Speed "+computer_object.Programming("3.8GHz")+" Owner= "+ owner.name)


}