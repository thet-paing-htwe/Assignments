package com.tphtwe.assignments2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.models.RecyclerModel3
import kotlinx.android.synthetic.main.item_fragment_recycler3.view.*

class RecyclerAdapter3(var arrRecycler3:ArrayList<RecyclerModel3>) : RecyclerView.Adapter<RecyclerAdapter3.RecyclerViewHolder3>(){
    class RecyclerViewHolder3(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(recyclerModel3: RecyclerModel3){
            itemView.recycler3Img.setImageResource(recyclerModel3.image)
            itemView.offpercent.text=recyclerModel3.offPercent.toString()
            itemView.name.text=recyclerModel3.name
            itemView.company.text=recyclerModel3.company
            itemView.nowprice.text=recyclerModel3.currentP
            itemView.expprice.text=recyclerModel3.oldP
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder3 {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_recycler3,parent,false)
        return RecyclerViewHolder3(view)
    }

    override fun getItemCount(): Int {
        return arrRecycler3.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder3, position: Int) {
        holder.bind(arrRecycler3[position])
    }
}