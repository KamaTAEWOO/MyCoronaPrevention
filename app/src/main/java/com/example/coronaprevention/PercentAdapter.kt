package com.example.coronaprevention

import android.content.Context
import android.graphics.Color.GREEN
import android.graphics.Color.RED
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PercentAdapter (val context: Context, val percents: List<Percent>) :
    RecyclerView.Adapter<PercentAdapter.Holder>() {

    // 뷰홀더 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_percent, parent, false)
        return Holder(view)
    }
    // 뷰홀더가 생성 되었을때
    override fun getItemCount(): Int {
        return percents.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(percents[position])
    }

    //
    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val nameTv = itemView?.findViewById<TextView>(R.id.itemName)
        val lifeTv = itemView?.findViewById<TextView>(R.id.itemLifeSpan)
        val originTv = itemView?.findViewById<TextView>(R.id.itemOrigin)

        // 데이터와 뷰를 묶는다.
        fun bind(percent: Percent) {
            nameTv?.text = percent.catName
            lifeTv?.text = percent.lifeSpan.toString() + "%"
            Log.d("퍼센트", lifeTv!!.text as String)
            if(percent.lifeSpan >= 25){
                originTv!!.setTextColor(RED)
            }
            originTv?.text = percent.origin
        }
    }

}