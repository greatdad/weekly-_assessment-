package com.example.week5edoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Felix", "Ibru", R.drawable.ic_heart ))
        arrayList.add(Model("Chucks", "Dog", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))
        arrayList.add(Model("Edoh", "Gift", R.drawable.ic_heart ))


        val myAdapter = MyAdapter(arrayList, this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler1.adapter = myAdapter
    }
}