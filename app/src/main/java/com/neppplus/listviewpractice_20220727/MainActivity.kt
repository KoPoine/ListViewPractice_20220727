package com.neppplus.listviewpractice_20220727

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20220727.datas.StudentData

class MainActivity : AppCompatActivity() {

//    멤버변수 생성
    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        수강생 더미 데이터 (임시방편)
        mStudentList.add( StudentData("김민철", "서울시 서대문구", 1990) )
        mStudentList.add( StudentData("이규행", "경기도 의왕시", 1994) )
        mStudentList.add( StudentData("한상민", "서울시 동대문구", 1999) )
        mStudentList.add( StudentData("윤예은", "인천시 연수구", 1993) )
        mStudentList.add( StudentData("허신지", "서울시 종로구", 1998) )
        mStudentList.add( StudentData("유수아", "서울시 마포구", 1997) )

    }

}