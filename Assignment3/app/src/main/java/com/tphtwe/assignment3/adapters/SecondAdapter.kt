package com.tphtwe.assignment3.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.models.SecondModel
import kotlinx.android.synthetic.main.item_fragment_second.view.*

class SecondAdapter(var arrSecond:ArrayList<SecondModel>) :RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){
    class SecondViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(secondModel: SecondModel){
            itemView.secondImg.setImageResource(secondModel.image1)
            itemView.secondName.text=secondModel.name1
            itemView.secondPrice.text=secondModel.price1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        var view1=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_second,parent,false)
        return SecondViewHolder(view1)
    }

    override fun getItemCount(): Int {
       return arrSecond.size
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(arrSecond[position])
    }
}