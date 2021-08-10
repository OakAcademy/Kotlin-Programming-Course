package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {

    print("Please enter a day number of week : ")

    var dayNumber:Int = readLine()!!.toInt()
    var day:String

    when(dayNumber)
    {
        1 -> day = "Monday"
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else -> day = "Invalid day choice"
    }

    println("Day is $day")

}