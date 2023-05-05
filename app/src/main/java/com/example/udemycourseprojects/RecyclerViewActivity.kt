package com.example.udemycourseprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    private var itemList =  ArrayList<Items>()
    private var recyclerView: RecyclerView? = null
    private var recyclerviewItemAdapter: RecyclerviewItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        prepareItem()

        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerviewItemAdapter = RecyclerviewItemAdapter(itemList)
        recyclerView!!.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = recyclerviewItemAdapter
        recyclerviewItemAdapter!!.setOnItemClickListener(object : ClickListener<Items> {
            override fun onClick(view: View?, data: Items, position: Int) {
                Toast.makeText(applicationContext, """Position = $position Item = ${data.name}""", Toast.LENGTH_SHORT
                ).show()
            }
        })

    }

    private fun prepareItem() {
        for(i in 0..49) {
            val items = Items("Item $i", (20+i).toString())
            itemList.add(items)
        }
    }
}