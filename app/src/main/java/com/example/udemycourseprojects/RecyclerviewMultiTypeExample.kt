package com.example.udemycourseprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewMultiTypeExample : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    var dataList = ArrayList<DataItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_multi_type_example)
        Initialiser()

        val adapter = RecyclerViewAdapter(this, dataList)
        recyclerView = findViewById(R.id.recyclerView2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    fun Initialiser() {
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "1. Hi! I am in View 1"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "2. Hi! I am in View 2"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "3. Hi! I am in View 3"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "4. Hi! I am in View 4"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "5. Hi! I am in View 5"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "6. Hi! I am in View 6"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "7. Hi! I am in View 7"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "8. Hi! I am in View 8"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "9. Hi! I am in View 9"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "10. Hi! I am in View 10"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_1, "11. Hi! I am in View 11"))
        dataList.add(DataItem(RecyclerViewAdapter.VIEW_TYPE_2, "12. Hi! I am in View 12"))
    }
}