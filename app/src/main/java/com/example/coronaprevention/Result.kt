package com.example.coronaprevention

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.dinuscxj.progressbar.CircleProgressBar
//import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.activity_result.*
import java.text.SimpleDateFormat
import java.util.*


class Result : AppCompatActivity() {
    var ProValue : Int = 0
    var circleProgressBar: CircleProgressBar? = null
    private var percentDb : PercentDB? = null
    val currentDateTime = Calendar.getInstance().time
    var dateFormat = SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA).format(currentDateTime)
    var m_state : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        percentDb = PercentDB.getInstance(this)

        circleProgressBar=findViewById(R.id.cpb_circlebar);
        //sum값 받기기
        ProValue = intent.getIntExtra("ProgressValue", 0)
        Log.d("ProValue",ProValue.toString())
        circleProgressBar?.setProgress(ProValue)

        if(ProValue >= 25){
            txtresult.text = "심각합니다. 꼭 1339로 바로 전화하세요."
            m_state = "심각"
        }else{
            m_state = "안전"
        }

        /* 새로운 cat 객체를 생성, id 이외의 값을 지정 후 DB에 추가 */
        val addRunnable = Runnable {
            val newCat = Percent()
            newCat.catName = dateFormat
            newCat.lifeSpan = ProValue
            newCat.origin =  m_state
            percentDb?.percentDao()?.insert(newCat)
        }

        //지난결과 클래스 연결.
        btnsave.setOnClickListener {
            val addThread = Thread(addRunnable)
            addThread.start()

            val intent = Intent(this, PastResult::class.java)
            startActivity(intent)
        }
    }
    //뒤로가기 막기
    override fun onBackPressed() {
        //super.onBackPressed()
        Log.d("back","back")
    }
    override fun onDestroy() {
        PercentDB.destroyInstance()
        super.onDestroy()
    }
}
