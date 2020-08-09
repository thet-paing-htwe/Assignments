package com.tphtwe.assignment3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.models.ThirdModel
import kotlinx.android.synthetic.main.item_fragment_third.view.*

class ThirdAdapter(var thirdArr:ArrayList<ThirdModel>):RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>(){
    class ThirdViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(thirdModel: ThirdModel){
            itemView.thirdImg.setImageResource(thirdModel.image)
            itemView.collection.text=thirdModel.collection
            itemView.description.text=thirdModel.newArrival
            itemView.weather.text=thirdModel.weather

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_third,parent,false)
        return ThirdViewHolder(view)
    }

    override fun getItemCount(): Int {
        return thirdArr.size
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.bind(thirdArr[position])
    }
}