package com.tphtwe.assignments2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.adapters.RecyclerAdapter3
import com.tphtwe.assignments2.models.RecyclerModel3
import kotlinx.android.synthetic.main.fragment_recycler3.*

class RecyclerFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var recyclerArr3=ArrayList<RecyclerModel3>()
        recyclerArr3.add(RecyclerModel3(R.drawable.laptop,30,"Dell laptop","Dell","1258900Ks","14587000Ks"))
        recyclerArr3.add(RecyclerModel3(R.drawable.car,32,"Rll Royce latest bran","Roll Royce","1258900000Ks",""))
        recyclerArr3.add(RecyclerModel3(R.drawable.bed,33,"Luxury Bed","Standard","1258900Ks","1458700Ks"))
        recyclerArr3.add(RecyclerModel3(R.drawable.gamingpc,34,"Gaming Pc","Alien Ware","12589000Ks","2158700Ks"))
        recyclerArr3.add(RecyclerModel3(R.drawable.p4game,35,"P4 Gaming Gadget","Corsair","1258900Ks","16587000Ks"))

        recyclerView3.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=RecyclerAdapter3(recyclerArr3)
        }
    }

}