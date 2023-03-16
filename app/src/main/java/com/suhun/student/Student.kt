package com.suhun.student

class Student(var name:String?=null,var math:Int = 0,var chinese:Int = 0){
    fun getAverage():Float{
        return (math.toFloat() + chinese.toFloat()) / 2
    }

    fun getGrade() = when(getAverage()){
        in 90.0..100.0 -> "A"
        in 80.0..89.0 -> "B"
        in 70.0..79.0 -> "C"
        in 60.0..69.0 -> "D"
        else -> "F"
    }
}