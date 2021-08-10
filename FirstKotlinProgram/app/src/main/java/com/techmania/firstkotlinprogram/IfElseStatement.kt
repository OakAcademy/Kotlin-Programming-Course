package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {

    print("Please enter a number : ")

    var number:Int = readLine()!!.toInt()

    if (number % 2 == 0)
    {
        println("$number is an even")
    }
    else
    {
        println("$number is an odd")
    }

}