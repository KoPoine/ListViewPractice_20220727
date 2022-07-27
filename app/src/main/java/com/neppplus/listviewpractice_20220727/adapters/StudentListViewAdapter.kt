package com.neppplus.listviewpractice_20220727.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listviewpractice_20220727.R
import com.neppplus.listviewpractice_20220727.datas.StudentData
import kotlinx.android.synthetic.main.student_list_item.view.*

class StudentListViewAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        1. 한 칸의 xml을 연결 (inflate)
        var tempRow = convertView
        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

//        2. 실제 데이터 반영  (set)
        row.nameTxt.text = mList[position].name
        row.addressTxt.text = mList[position].address
//        row.ageTxt.text = mList[position].birthYear.toString()

//        변수를 활용한 String 가공
        val koreanAge = 2022 - mList[position].birthYear + 1
        row.ageTxt.text = "(${koreanAge}세)"

        return row
    }
}