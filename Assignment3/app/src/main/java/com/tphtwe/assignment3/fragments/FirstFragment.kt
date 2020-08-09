package com.tphtwe.assignment3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.adapters.FirstAdapter
import com.tphtwe.assignment3.models.FirstModel
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrFirst=ArrayList<FirstModel>()
        arrFirst.add(FirstModel(R.drawable.chairs,"Chairs",15460))
        arrFirst.add(FirstModel(R.drawable.table,"Table",13460))
        arrFirst.add(FirstModel(R.drawable.sofa,"Sofa",12460))
        firstRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=FirstAdapter(arrFirst)
        }
    }
}