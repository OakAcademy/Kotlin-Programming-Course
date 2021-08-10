package com.techmania.objectorientedprogramming

fun main(args: Array<String>) {



    //creating an object from class
    /*
    var myCar = Cars()

    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()

    myCar2.name = "Mercedes"
    myCar2.model = 2010

    println("My first car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My second car's name is ${myCar2.name} and its model is ${myCar2.model}")

     */

    //var myNewCar = MyCars("Ferrari",2021)
    //println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

    var mySecondCar = MySecondCars("Mercedes",2000)

    mySecondCar.name = "Opel"
    //mySecondCar.model = 2010 //set

    println("My second car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}") //get



}