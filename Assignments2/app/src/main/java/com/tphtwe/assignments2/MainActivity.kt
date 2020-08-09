package com.tphtwe.assignments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tphtwe.assignments2.fragments.Fragment1
import com.tphtwe.assignments2.fragments.Fragment2
import com.tphtwe.assignments2.fragments.Fragment3
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTrasnsaction1.setBackgroundResource(R.drawable.radiocheck)
        btnTrasnsaction2.setBackgroundResource(R.drawable.radio1)
        btnTrasnsaction3.setBackgroundResource(R.drawable.radio1)
        val fragment1=Fragment1()
        val transaction=supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragmentContainer,fragment1)
        transaction.commit()

        btnTrasnsaction1.setOnClickListener {
            val fragment1=Fragment1()
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,fragment1)
            transaction.commit()
            btnTrasnsaction1.setBackgroundResource(R.drawable.radiocheck)
            btnTrasnsaction2.setBackgroundResource(R.drawable.radio1)
            btnTrasnsaction3.setBackgroundResource(R.drawable.radio1)
        }
        btnTrasnsaction2.setOnClickListener {
            val fragment2=Fragment2()
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,fragment2)
            transaction.commit()
            btnTrasnsaction1.setBackgroundResource(R.drawable.radio1)
            btnTrasnsaction2.setBackgroundResource(R.drawable.radiocheck)
            btnTrasnsaction3.setBackgroundResource(R.drawable.radio1)
        }
        btnTrasnsaction3.setOnClickListener {
            val fragment3=Fragment3()
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,fragment3)
            transaction.commit()
            btnTrasnsaction1.setBackgroundResource(R.drawable.radio1)
            btnTrasnsaction2.setBackgroundResource(R.drawable.radio1)
            btnTrasnsaction3.setBackgroundResource(R.drawable.radiocheck)
        }
    }
}