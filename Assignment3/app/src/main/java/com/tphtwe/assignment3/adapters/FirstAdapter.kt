package com.tphtwe.assignment3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.models.FirstModel
import kotlinx.android.synthetic.main.item_fragment_first.view.*

class FirstAdapter(var firstArr:ArrayList<FirstModel>):RecyclerView.Adapter<FirstAdapter.FirstViewHolder>(){
    class FirstViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(firstModel: FirstModel){
            itemView.firstImageView.setImageResource(firstModel.image)
            itemView.firstName.text=firstModel.name
            itemView.firstCount.text=firstModel.count.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_first,parent,false)
        return FirstViewHolder(view)
    }

    override fun getItemCount(): Int {
        return firstArr.size
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
       holder.bind(firstArr[position])
    }
}