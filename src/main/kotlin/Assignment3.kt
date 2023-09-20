//assignment
fun main(){
//    1. Crete a program to check whether number is even or odd
    val num=7
    if (num %2 ==0){
        println("$num is even ")
    }
    else println("$num is odd")
//    2. create a program to check the largest number out of 3 numbers
    var num1=6
    var num2=4
    var num3=5
    if (num1 >num2 && num1> num3) println("$num1 is the largest")
    else if (num2 >num3 && num2 >num1) println("$num2 is the largest")
    else println("$num3 is the largest")
//    3. create a program to check if a letter is vowel or consonant
//    Vowels = a,e,i,o,u
    var char ='y'
    if (char =='a' || char =='e' || char =='i' || char =='o' ||char =='u')
        println("$char is a vowel")
    else println("$char is a consonant")


    var statement="I ate 5 chapatis"
    //ise if statements to:
    //create a program to calculate the number of vowels, consonants,digits,white spaces in a sentence/statement
    //create a program to check if a letter or char is an alphabet
    var letter='4'
     if (letter in 'a'..'z' || letter in 'A'..'Z'){
         println("$letter is an alphabet")
     }

    else println("$letter not an alphabet")


}
