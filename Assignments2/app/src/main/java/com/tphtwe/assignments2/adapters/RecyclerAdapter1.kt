package com.tphtwe.assignments2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.models.RecyclerModel1
import kotlinx.android.synthetic.main.item_fragment_recycler1.view.*

class RecyclerAdapter1(var frag1Arr:ArrayList<RecyclerModel1>) :RecyclerView.Adapter<RecyclerAdapter1.Recycler1ViewHolder>(){
    class Recycler1ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(recyclerModel1: RecyclerModel1){
            itemView.fragment1Img.setImageResource(recyclerModel1.image)
            itemView.fragment1Name.text=recyclerModel1.name.toString()
            itemView.fragment1Code.text=recyclerModel1.code.toString()
            itemView.fragment1Designer.text=recyclerModel1.designer.toString()
            itemView.currentPrice.text=recyclerModel1.currentPrice.toString()
            itemView.oldPrice.text=recyclerModel1.oldPrice.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycler1ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_fragment_recycler1,parent,false)
        return Recycler1ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return frag1Arr.size
    }

    override fun onBindViewHolder(holder: Recycler1ViewHolder, position: Int) {
        holder.bind(frag1Arr[position])
    }


}