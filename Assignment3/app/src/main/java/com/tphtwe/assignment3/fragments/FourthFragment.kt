package com.tphtwe.assignment3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.adapters.FourthAdapter
import com.tphtwe.assignment3.models.FourthModel
import kotlinx.android.synthetic.main.fragment_fourth2.*

class FourthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrFourth = ArrayList<FourthModel>()
        arrFourth.add(FourthModel(R.drawable.chair1, "Confort chair", "$30"))
        arrFourth.add(FourthModel(R.drawable.chair2, "Confort chair", "$31"))
        arrFourth.add(FourthModel(R.drawable.chair3, "Confort chair", "$29"))
        arrFourth.add(FourthModel(R.drawable.chair4, "Confort chair", "$35"))
        fourthRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = FourthAdapter(arrFourth)
        }
    }
}

