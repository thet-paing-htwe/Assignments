package com.tphtwe.assignments2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tphtwe.assignments2.R
import com.tphtwe.assignments2.adapters.RecyclerAdapter1
import com.tphtwe.assignments2.models.RecyclerModel1
import kotlinx.android.synthetic.main.fragment_recycler1.*

class RecyclerFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var Arrfrag1=ArrayList<RecyclerModel1>()
        Arrfrag1.add(RecyclerModel1(R.drawable.bag,"Ladies Handbag","NZ14534","South Korea","KS-12340000","Ks-34500000"))
        Arrfrag1.add(RecyclerModel1(R.drawable.tshirt,"T Shirt","NZ14534","Lady GaGa","KS-123400",""))
        Arrfrag1.add(RecyclerModel1(R.drawable.laptop,"Laptop","NZ14534","Dell","KS-12340000","Ks-34500000"))
        recyclerView1.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=RecyclerAdapter1(Arrfrag1)
        }
    }


}