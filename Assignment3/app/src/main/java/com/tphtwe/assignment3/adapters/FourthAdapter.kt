package com.tphtwe.assignment3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.models.FourthModel
import kotlinx.android.synthetic.main.item_fragment_fourth.view.*


class FourthAdapter(var arrFourth:ArrayList<FourthModel>) : RecyclerView.Adapter<FourthAdapter.FourthViewHolder>(){
    class FourthViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(fourthModel: FourthModel){
            itemView.fourthImg.setImageResource(fourthModel.image1)
            itemView.fourthName.text=fourthModel.name1
            itemView.fourthPrice.text=fourthModel.price1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FourthViewHolder {
        var view1=
            LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_fourth,parent,false)
        return FourthViewHolder(view1)
    }

    override fun getItemCount(): Int {
        return arrFourth.size
    }

    override fun onBindViewHolder(holder: FourthViewHolder, position: Int) {
        holder.bind(arrFourth[position])
    }
}