package com.tphtwe.assignment3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.adapters.SecondAdapter
import com.tphtwe.assignment3.models.SecondModel
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrSecond=ArrayList<SecondModel>()
        arrSecond.add(SecondModel(R.drawable.chair1,"Confort chair","$30"))
        arrSecond.add(SecondModel(R.drawable.chair2,"Confort chair","$31"))
        arrSecond.add(SecondModel(R.drawable.chair3,"Confort chair","$29"))
        arrSecond.add(SecondModel(R.drawable.chair4,"Confort chair","$35"))
        secondRecycler.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=SecondAdapter(arrSecond)
        }
    }

}