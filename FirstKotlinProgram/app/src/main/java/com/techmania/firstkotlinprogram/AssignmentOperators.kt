package com.techmania.firstkotlinprogram

fun main(args: Array<String>) {

    var x:Int = 20
    var y:Int = 15
    var z:Int = 0

    z = x + y

    println("z = x + y = " + z)

    z +=x // z = z + x

    println("z +=x = " + z)

    z -=x // z = z - x

    println("z -=x = " + z)

    z *=x // z = z * x

    println("z *=x = " + z)

    z /=x // z = z / x

    println("z /=x = " + z)

    z %=x // z = z % x

    println("z %=x = " + z)

}