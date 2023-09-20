

//Data types
//create the main function
fun main(){
    //array-collection of items with the same datatype
    val numbers = arrayOf(67,5,4,3,23)
    println(numbers)

//    ListOf
    var fruits=listOf("Oranges","Apple","Water Melon","Banana")
    println(fruits)

    var listnumbers =listOf(4,54,3,2,2,1)
    println(listnumbers)

    var languages=listOf<String>("Kotlin","Java","PHP","Python","Python")
    println(languages)

//    setOf
    var names= setOf("Mike","Wayne","Rachael","Pauline","Pauline")
    println(names)
    var marks=setOf(34,45,65,67,87,97)
    println(marks)

//    mapOf
    var personal_Details= mapOf("name" to "john","course" to "Engineering",
        "University" to "University of Nairobi")
    println(personal_Details)
}