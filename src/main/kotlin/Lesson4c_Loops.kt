//do while,when
fun main(){
    //do while
    //create a program to display multiplication table (factor 3)
    var factor=3
    var number =1
    do{
        val answer=factor *number
        println("$factor * $number =$answer  "+factor*number)
        number++
    }
    while (number <=10)


    //when
//execute a block of statement when a certain condition is satisfied
//if the condition is true we  point -> to a certain statement
    var char='6'
    when (char){
        in 'a'..'z'->println("$char is an alphabet")
        in '0'..'9'->println("$char is a digit")
    }

//    create a program to print the season based on the given month
    //Given : Spring,winter,Autum,summer
    //btn march to may= spring
    //june to august=summer
    //sept to november= Autum
    //dec to feb =winter
    //list the months
    //numbers range
//    create a list of 12 months
    var months= listOf("Invalid","January","February","March","April","May","June",
        "July","August","September","October","November","December")
//    accessing the items in a list
    println(months[0])
//   for ((index,month) in months.withIndex()){
//       println("Month is $month and index is $index")
//   }
    print("Enter month as a digit: ")
    val month= readln()!!.toInt()
    when (month){
        in 3..5-> println("Month= "+ months[month] +" season = Spring")
        in 6..8-> println("Month=  "+ months[month]+ " season = Summer")
        in 9..11-> println("Month= " +months[month]+ "  season = Autum")
        12,1,2 ->println("Month= "+ months[month]+ " season = Winter")
    }
}


