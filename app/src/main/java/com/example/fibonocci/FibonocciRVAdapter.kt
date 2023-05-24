package com.example.fibonocci

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonocciRVAdapter(var number: MainActivity):RecyclerView.Adapter<numberViewHolder>() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): numberViewHolder {
      var numberView=LayoutInflater.from(parent.context).inflate(R.layout.fibonocci_list_numbers,parent,false)
        return numberViewHolder(numberView)

    }


    override fun onBindViewHolder(holder: numberViewHolder, position: Int) {
        holder.tvNumber.text=number[position].toString()


    }

    override fun getItemCount(): Int {
        return number.size

    }

}

class numberViewHolder(numberView:View) :ViewHolder(numberView){
    var tvNumber=numberView.findViewById<TextView>(R.id.tvNumber)

}
