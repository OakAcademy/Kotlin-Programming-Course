package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {

    var number1:Int = 5
    var number2:Int = 8
    var number3:Int = 12

    var result:Boolean = false

    //Conditional Operator (&&)

    result = (number1 > number2) && (number3 > number2)
    println("Result: " + result)

    //Conditional Operator (||)

    result = (number1 > number2) || (number3 > number2)
    println("Result: " + result)

}