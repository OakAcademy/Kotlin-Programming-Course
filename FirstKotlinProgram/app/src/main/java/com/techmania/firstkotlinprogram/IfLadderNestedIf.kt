package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {

    print("Please enter 3 numbers : ")
    var number1:Int = readLine()!!.toInt()
    var number2:Int = readLine()!!.toInt()
    var number3:Int = readLine()!!.toInt()

    var largestNumber:Int

    if (number1 >= number2)
    {
        if (number1 >= number3)
        {
            largestNumber = number1
        }
        else
        {
            largestNumber = number3
        }
    }
    else
    {
        if (number2 >= number3)
        {
            largestNumber = number2
        }
        else
        {
            largestNumber = number3
        }
    }

    println("The largest number is $largestNumber")


/*
    print("Please enter your age : ")

    var yourAge:Int = readLine()!!.toInt()

    if (yourAge < 13)
    {
        print("You are a child.")
    }
    else if (yourAge < 19)
    {
        print("You are a teenager.")
    }
    else
    {
        if (yourAge < 65)
        {
            print("You are an adult.")
        }
        else
        {
            print("You are a senior.")
        }

    }*/

}