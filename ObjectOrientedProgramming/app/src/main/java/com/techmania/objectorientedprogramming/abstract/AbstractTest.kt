package com.techmania.objectorientedprogramming.abstract

fun main(args: Array<String>) {

    //var vehicle = Vehicle()

    var car = Car(2021)
    car.speed = 300

    println("Name  : ${car.vehicleName("Ferrari")} \n " +
            "Type  : ${car.vehicleType("Car")} \n " +
            "Model : ${car.model} \n " +
            "Speed : ${car.speed}")

}