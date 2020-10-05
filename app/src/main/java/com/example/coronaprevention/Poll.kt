package com.example.coronaprevention

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_poll.*

class Poll : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    var ischeckedok1 = false;
    var ischeckedno1 = false;

    var ischeckedok2 = false;
    var ischeckedno2 = false;

    var ischeckedok3 = false;
    var ischeckedno3 = false;

    var ischeckedok4 = false;
    var ischeckedno4 = false;

    var ischeckedok5 = false;
    var ischeckedno5 = false;

    var ischeckedok6 = false;
    var ischeckedno6 = false;

    var sum: Int = 0
    var sum1: Int = 0
    var sum2: Int = 0
    var sum3: Int = 0
    var sum4: Int = 0
    var sum5: Int = 0
    var sum6: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poll)

        //yes클릭시 변경
        //글자색 -> 흰색, 버튼 배경 -> 남색
        //1.열
        btnfever_ok.setOnClickListener {
            if(ischeckedok1 == false){
                btnfever_ok.setTextColor(Color.WHITE)
                btnfever_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum1 = 25
                Log.d("Prosum1",sum1.toString()) //25 나옴
                btnfever_no.isEnabled = false
                ischeckedok1 = true
            }else{
                sum1 = 0
                btnfever_ok.setTextColor(Color.GRAY)
                btnfever_ok.setBackgroundResource(R.drawable.bluelienbackground)
                btnfever_ok.setBackgroundColor(Color.WHITE)
                btnfever_ok.setBackgroundResource(R.drawable.graylien2)
                btnfever_no.isEnabled = true
                ischeckedok1 = false
            }
        }
        Log.d("Prosum1",sum1.toString())//0나옴
        btnfever_no.setOnClickListener {
            if(ischeckedno1 == false){
                btnfever_no.setTextColor(Color.WHITE)
                btnfever_no.setBackgroundResource(R.drawable.bluelienbackground)
                btnfever_ok.isEnabled = false
                ischeckedno1 = true
            }else{
                btnfever_no.setTextColor(Color.GRAY)
                btnfever_no.setBackgroundColor(Color.WHITE)
                btnfever_no.setBackgroundResource(R.drawable.graylien2)
                btnfever_ok.isEnabled = true
                ischeckedno1 = false
            }
        }
        //2.기침침
       btncough_ok.setOnClickListener {
            if(ischeckedok2 == false){
                btncough_ok.setTextColor(Color.WHITE)
                btncough_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum2 = 15
                btncough_no.isEnabled = false
                ischeckedok2 = true
            }else{
                sum2 = 0
                btncough_ok.setTextColor(Color.GRAY)
                btncough_ok.setBackgroundColor(Color.WHITE)
                btncough_ok.setBackgroundResource(R.drawable.graylien2)
                btncough_no.isEnabled = true
                ischeckedok2 = false
            }
        }
        btncough_no.setOnClickListener {
            if(ischeckedno2 == false){
                btncough_no.setTextColor(Color.WHITE)
                btncough_no.setBackgroundResource(R.drawable.bluelienbackground)
                btncough_ok.isEnabled = false
                ischeckedno2 = true
            }else{
                btncough_no.setTextColor(Color.GRAY)
                btncough_no.setBackgroundColor(Color.WHITE)
                btncough_no.setBackgroundResource(R.drawable.graylien2)
                btncough_ok.isEnabled = true
                ischeckedno2 = false
            }
        }
        //3.가래
        btnsputum_ok.setOnClickListener {
            if(ischeckedok3 == false){
                btnsputum_ok.setTextColor(Color.WHITE)
                btnsputum_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum3 = 15
                btnsputum_no.isEnabled = false
                ischeckedok3 = true
            }else{
                sum3 = 0
                btnsputum_ok.setTextColor(Color.GRAY)
                btnsputum_ok.setBackgroundColor(Color.WHITE)
                btnsputum_ok.setBackgroundResource(R.drawable.graylien2)
                btnsputum_no.isEnabled = true
                ischeckedok3 = false
            }
        }
        btnsputum_no.setOnClickListener {
            if(ischeckedno3 == false){
                btnsputum_no.setTextColor(Color.WHITE)
                btnsputum_no.setBackgroundResource(R.drawable.bluelienbackground)
                btnsputum_ok.isEnabled = false
                ischeckedno3 = true
            }else{
                btnsputum_no.setTextColor(Color.GRAY)
                btnsputum_no.setBackgroundColor(Color.WHITE)
                btnsputum_no.setBackgroundResource(R.drawable.graylien2)
                btnsputum_ok.isEnabled = true
                ischeckedno3 = false
            }
        }
        //4.오한
        btnchills_ok.setOnClickListener {
            if(ischeckedok4 == false){
                btnchills_ok.setTextColor(Color.WHITE)
                btnchills_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum4 = 15
                btnchills_no.isEnabled = false
                ischeckedok4 = true
            }else{
                sum4 = 0
                btnchills_ok.setTextColor(Color.GRAY)
                btnchills_ok.setBackgroundColor(Color.WHITE)
                btnchills_ok.setBackgroundResource(R.drawable.graylien2)
                btnchills_no.isEnabled = true
                ischeckedok4 = false
            }
        }
        btnchills_no.setOnClickListener {
            if(ischeckedno4 == false){
                btnchills_no.setTextColor(Color.WHITE)
                btnchills_no.setBackgroundResource(R.drawable.bluelienbackground)
                btnchills_ok.isEnabled = false
                ischeckedno4 = true
            }else{
                btnchills_no.setTextColor(Color.GRAY)
                btnchills_no.setBackgroundColor(Color.WHITE)
                btnchills_no.setBackgroundResource(R.drawable.graylien2)
                btnchills_ok.isEnabled = true
                ischeckedno4 = false
            }
        }
        //5.목쓰림/목아픔
        btnsore_ok.setOnClickListener {
            if(ischeckedok5 == false){
                btnsore_ok.setTextColor(Color.WHITE)
                btnsore_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum5 = 15
                btnsore_no.isEnabled = false
                ischeckedok5 = true
            }else{
                sum5 = 0
                btnsore_ok.setTextColor(Color.GRAY)
                btnsore_ok.setBackgroundColor(Color.WHITE)
                btnsore_ok.setBackgroundResource(R.drawable.graylien2)
                btnsore_no.isEnabled = true
                ischeckedok5 = false
            }
        }
        btnsore_no.setOnClickListener {
            if(ischeckedno5 == false){
                btnsore_no.setTextColor(Color.WHITE)
                btnsore_no.setBackgroundResource(R.drawable.bluelienbackground)
                btnsore_ok.isEnabled = false
                ischeckedno5 = true
            }else{
                btnsore_no.setTextColor(Color.GRAY)
                btnsore_no.setBackgroundColor(Color.WHITE)
                btnsore_no.setBackgroundResource(R.drawable.graylien2)
                btnsore_ok.isEnabled = true
                ischeckedno5 = false
            }
        }
        //6.호흡곤란
        btndyspnea_ok.setOnClickListener {
            if(ischeckedok6 == false){
                btndyspnea_ok.setTextColor(Color.WHITE)
                btndyspnea_ok.setBackgroundResource(R.drawable.bluelienbackground)
                sum6 = 15
                btndyspnea_no.isEnabled = false
                ischeckedok6 = true
            }else{
                sum6 = 0
                btndyspnea_ok.setTextColor(Color.GRAY)
                btndyspnea_ok.setBackgroundColor(Color.WHITE)
                btndyspnea_ok.setBackgroundResource(R.drawable.graylien2)
                btndyspnea_no.isEnabled = true
                ischeckedok6 = false
            }
        }
        btndyspnea_no.setOnClickListener {
            if(ischeckedno6 == false){
                btndyspnea_no.setTextColor(Color.WHITE)
                btndyspnea_no.setBackgroundResource(R.drawable.bluelienbackground)
                btndyspnea_ok.isEnabled = false
                ischeckedno6 = true
            }else{
                btndyspnea_no.setTextColor(Color.GRAY)
                btndyspnea_no.setBackgroundColor(Color.WHITE)
                btndyspnea_no.setBackgroundResource(R.drawable.graylien2)
                btndyspnea_ok.isEnabled = true
                ischeckedno6 = false
            }
        }
        //결과
        btnpoll_result.setOnClickListener {
            sum = sum1 + sum2 + sum3 + sum4 + sum5 + sum6
            Log.d("Prosum",sum.toString())
            val intent = Intent(this, Result::class.java)
            intent.putExtra("ProgressValue",sum)
            startActivity(intent)
        }
    }
    //뒤로가기 막기
    override fun onBackPressed() {
        //super.onBackPressed()
        Log.d("back","back")
    }
}