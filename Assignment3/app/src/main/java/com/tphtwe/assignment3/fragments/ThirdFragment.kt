package com.tphtwe.assignment3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignment3.R
import com.tphtwe.assignment3.adapters.ThirdAdapter
import com.tphtwe.assignment3.models.ThirdModel
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var arrThird=ArrayList<ThirdModel>()
        arrThird.add(ThirdModel(R.drawable.sofabed,"collection","New Arrival","Winter"))
        arrThird.add(ThirdModel(R.drawable.sofacustom,"collection","New Arrival","Customise"))
        arrThird.add(ThirdModel(R.drawable.jacket,"collection","New Arrival","Winter Lady"))
        arrThird.add(ThirdModel(R.drawable.jacketmen,"collection","New Arrival","Winter Men"))
        thirdRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=ThirdAdapter(arrThird)
        }
    }

}