package com.example.verticalrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var context: Context,
                var stuffList: ArrayList<Stuff>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder
    = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))


    override fun getItemCount(): Int { return stuffList.size }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var stuffObj = stuffList.get(position)
        holder.stuffNameTv.text = stuffObj.stuffName
        holder.stuffEmailTv.text = stuffObj.stuffEmail
        holder.stuffImage.setImageResource(stuffObj.stuffImage)

        var animation1 = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left)
        holder.stuffImage.animation = animation1
    }






   inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       lateinit var stuffNameTv : TextView
       lateinit var stuffEmailTv :TextView
       lateinit var stuffImage : ImageView

       init {
           stuffNameTv = itemView.findViewById(R.id.stuffName)
           stuffEmailTv = itemView.findViewById(R.id.stuffEmail)
           stuffImage   = itemView.findViewById(R.id.stuffImageView)
       }


    }
}