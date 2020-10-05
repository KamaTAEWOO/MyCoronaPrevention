package com.example.coronaprevention

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.amitshekhar.DebugDB
import kotlinx.android.synthetic.main.activity_past_result.*
import java.text.SimpleDateFormat
import java.util.*

class PastResult : AppCompatActivity() {
    private var percentDb : PercentDB? = null
    private var percentList = listOf<Percent>()
    lateinit var mAdapter : PercentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_result)
        DebugDB.getAddressLog()

        percentDb = PercentDB.getInstance(this)
        mAdapter = PercentAdapter(this, percentList)

        val r = Runnable {
            try {
                percentList = percentDb?.percentDao()?.getAll()!!
                mAdapter = PercentAdapter(this, percentList)
                mAdapter.notifyDataSetChanged()

                mRecyclerView.adapter = mAdapter
                mRecyclerView.layoutManager = LinearLayoutManager(this)
                mRecyclerView.setHasFixedSize(true)
            } catch (e: Exception) {
                Log.d("tag", "Error - $e")
            }
        }

        val thread = Thread(r)
        thread.start()
    }

    override fun onDestroy() {
        PercentDB.destroyInstance()
        percentDb = null
        super.onDestroy()
    }
    //뒤로가기 막기
    override fun onBackPressed() {
        //super.onBackPressed()
        Log.d("back","back")
    }
}
