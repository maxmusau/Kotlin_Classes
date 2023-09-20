//when
fun main(){
    //create a program to display the name of an object
    //satelite, planet,star
    print("Enter name of the object: ")
    var input=readLine()
    when (input){
        "sun"-> println("$input is a star")
        "moon"->println("$input is a satellite")
        "earth"->println("$input is a planet")
    }
    print("Enter your input: ")
    input= readLine()
    when (input){
        "Mango","Banana","Oranges","Water melon","Pawpaw"->println("$input is  a fruit")
        "Benz","Subaru","Ford","BMW","Audi","Ferari"->println("$input is  a Vehicle brand")
    }
}