//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Task1--12323564 ədədində hər bir ədədidin kvadratını tapın və sonra bu tapılmış ədədlərin ədədi ortasını tapın

//fun main(){
//    val number=12323564
//    val num1=number/10000000
//    val num2=((number/1000000)%10)
//    val num3=((number/100000)%10)
//    val num4=((number/10000)%10)
//    val num5=((number/1000)%10)
//    val num6=((number/100)%10)
//    val num7=((number/10)%10)
//    val num8=number%10
//    var result=1
//    val powerNumber=((num1*num1)+(num2*num2)+(num3*num3)+(num4*num4)+(num5*num5)+(num6*num6)+(num7*num7)+
//            (num8*num8))/8
//    println("The average of $number is $powerNumber")
//}

// Task2--.12323564 ədədin hər bir ədədi tapın və sonra onların hasilin tapan proqram yazın
//fun main(){
//    val number=12323564
//    val num1=number/10000000
//    val num2=((number/1000000)%10)
//    val num3=((number/100000)%10)
//    val num4=((number/10000)%10)
//    val num5=((number/1000)%10)
//    val num6=((number/100)%10)
//    val num7=((number/10)%10)
//    val num8=number%10
//    val multiplication=num1*num2*num3*num4*num5*num6*num7*num8
//    println("Multiplication of $number for each number is $multiplication")
//}

// Task3--12323564 ədədin hər bir ədədi tapın və onlarin hasili ilə ədədi ortasının cəmini tapın
//fun main() {
//    val number = 12323564
//    val num1 = number / 10000000
//    val num2 = ((number / 1000000) % 10)
//    val num3 = ((number / 100000) % 10)
//    val num4 = ((number / 10000) % 10)
//    val num5 = ((number / 1000) % 10)
//    val num6 = ((number / 100) % 10)
//    val num7 = ((number / 10) % 10)
//    val num8 = number % 10
//    val multiplication = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8
//    val average=(num1+num2+num3+num4+num5+num6+num7+num8)/8
//    val total=multiplication+average
//    println("The sum of multiplication and average in $number is $total")
//}


// Task4--12323564 ədədin ilk 4 ədədin hasili tapın və sonra son iki
//ədədin cəmini tapın.Tapılmış hasili cəmə böldükdə qalığı tapın.
//fun main() {
//    val number = 12323564
//    val num1 = number / 10000000
//    val num2 = ((number / 1000000) % 10)
//    val num3 = ((number / 100000) % 10)
//    val num4 = ((number / 10000) % 10)
//    val num5 = ((number / 1000) % 10)
//    val num6 = ((number / 100) % 10)
//    val num7 = ((number / 10) % 10)
//    val num8 = number % 10
//    val multiplication=num1*num2*num3*num4
//    val sum=num7+num8
//    val mod=multiplication%sum
//    println("The remainder is equal to $mod")
//}


// Task5--12323564 ədədin ilk 4 ədədin hasili  ilə son 4 ədədin cəmi arasındakı fərqin kvadratını tapın
fun main(){
    val number = 12323564
    val num1 = number / 10000000
    val num2 = ((number / 1000000) % 10)
    val num3 = ((number / 100000) % 10)
    val num4 = ((number / 10000) % 10)
    val num5 = ((number / 1000) % 10)
    val num6 = ((number / 100) % 10)
    val num7 = ((number / 10) % 10)
    val num8 = number % 10
    val multiplication=num1*num2*num3*num4
    val sum=num5+num6+num7+num8
    val total=multiplication*multiplication-2*multiplication*sum+sum*sum
    println("The answer is $total")
}


