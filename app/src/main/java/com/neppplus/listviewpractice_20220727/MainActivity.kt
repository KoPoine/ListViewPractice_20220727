package com.neppplus.listviewpractice_20220727

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.listviewpractice_20220727.adapters.StudentListViewAdapter
import com.neppplus.listviewpractice_20220727.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수 생성
    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentListviewAdapter : StudentListViewAdapter

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
        mStudentList.add( StudentData("김민철", "서울시 마포구", 1997) )
        mStudentList.add( StudentData("김민철", "서울시 마포구", 1991) )
        mStudentList.add( StudentData("김민철", "서울시 마포구", 1992) )
        mStudentList.add( StudentData("김민철", "서울시 마포구", 1996) )

//        어댑터 객체화 => 우리가 만들어놓은 ArrayList를 전달
        mStudentListviewAdapter = StudentListViewAdapter(
            this, R.layout.student_list_item, mStudentList)

//        xml에 있는 ListView와 어댑터 연결
        mainListView.adapter = mStudentListviewAdapter

//        리스트뷰 클릭 이벤트 처리
        mainListView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${mStudentList[position].name}님 클릭됨", Toast.LENGTH_SHORT).show()
        }
        
        mainListView.setOnItemLongClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${mStudentList[position].name}님 롱클릭됨", Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener true  // true - 롱클릭 이벤트 처리만 하는 코드
        }

    }

}