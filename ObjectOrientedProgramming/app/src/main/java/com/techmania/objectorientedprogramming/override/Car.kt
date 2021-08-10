package com.techmania.objectorientedprogramming.override

class Car : Vehicle() {

    fun superStart()
    {
        super.start()
    }

    fun superAccelerate()
    {
        super.accelerate(80)
    }

    fun superStop()
    {
        super.stop()
    }

    override fun start()
    {
        println("Car has started.")
    }

    override fun accelerate(speed:Int)
    {
        println("Car accelerates at $speed .")
    }

    override fun stop()
    {
        println("Car has stopped.")
    }

}