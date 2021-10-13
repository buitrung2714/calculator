package com.example.learn_kotlin

class Student {
    private var name: String = ""
    private var address: String = ""
    private var year: Int = 0

    constructor()

    constructor(inputName: String, inputAddress: String, inputYear: Int){
        name = inputName
        address = inputAddress
        year = inputYear
    }

    fun setName(inputName: String){
        name = inputName
    }

    fun getName(): String{
        return name
    }

    fun setAddress(inputAddress: String){
        address = inputAddress
    }

    fun getAddress(): String{
        return address
    }

    fun setYear(inputYear: Int) {
        year = inputYear
    }

    fun getYear() : Int {
        return year
    }

    fun calcYear() : Int {
        return 2021 - year
    }
}