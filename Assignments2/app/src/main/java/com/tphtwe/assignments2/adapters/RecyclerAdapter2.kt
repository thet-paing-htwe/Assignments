package com.tphtwe.assignments2.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.models.RecyclerModel2
import kotlinx.android.synthetic.main.item_fragment_recycler2.view.*

class RecyclerAdapter2(var arr2Recycler:ArrayList<RecyclerModel2>):RecyclerView.Adapter<RecyclerAdapter2.Recycler2ViewHolder>() {
    class Recycler2ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(recyclerModel2: RecyclerModel2){
            itemView.countryImg.setImageResource(recyclerModel2.image)
            itemView.countryTxt.text=recyclerModel2.country.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycler2ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_recycler2,parent,false)
        return Recycler2ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arr2Recycler.size
    }

    override fun onBindViewHolder(holder: Recycler2ViewHolder, position: Int) {

    holder.bind(arr2Recycler[position])
    }
}