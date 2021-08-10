package com.techmania.objectorientedprogramming.abstract

abstract class Vehicle {

    //abstract function
    abstract fun vehicleName(name:String) : String

    //non-abstract function
    fun vehicleType(type:String) : String
    {
        return type
    }

    //abstract property
    abstract var model:Int

    //non-abstract
    var speed:Int? = null

}