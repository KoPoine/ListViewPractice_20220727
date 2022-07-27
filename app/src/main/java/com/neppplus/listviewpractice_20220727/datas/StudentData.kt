package com.neppplus.listviewpractice_20220727.datas

class StudentData (
    val name : String,
    val address : String,
    val birthYear : Int
        ) {
    fun getKoreanAge(year : Int) : String {
        val koreanAge = year - birthYear + 1
        return "(${koreanAge}세)"
    }
}