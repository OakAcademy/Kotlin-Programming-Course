package com.techmania.objectorientedprogramming

class MySecondCars {

    var name:String? = null

    //Encapsulation
    var model:Int? = null
        private set
                get

    //constructor()
    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }


}