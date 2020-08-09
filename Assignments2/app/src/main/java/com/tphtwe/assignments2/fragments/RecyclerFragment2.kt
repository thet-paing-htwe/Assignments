package com.tphtwe.assignments2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.adapters.RecyclerAdapter2
import com.tphtwe.assignments2.models.RecyclerModel2
import kotlinx.android.synthetic.main.fragment_recycler2.*

class RecyclerFragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var recycler2Arr=ArrayList<RecyclerModel2>()
        recycler2Arr.add(RecyclerModel2(R.drawable.japan,"Japan"))
        recycler2Arr.add(RecyclerModel2(R.drawable.korea,"Korea"))
        recycler2Arr.add(RecyclerModel2(R.drawable.china,"China"))
        recycler2Arr.add(RecyclerModel2(R.drawable.worldmap,"International"))
        recyclerView2.apply {
            layoutManager=GridLayoutManager(context,2)
            adapter=RecyclerAdapter2(recycler2Arr)
        }
    }

}