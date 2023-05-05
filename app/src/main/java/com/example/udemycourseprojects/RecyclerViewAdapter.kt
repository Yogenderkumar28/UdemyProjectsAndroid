package com.example.udemycourseprojects

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(context: Context, list: ArrayList<DataItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    companion object {
        const val VIEW_TYPE_1 = 1
        const val VIEW_TYPE_2 = 2
    }
    private val context: Context = context
    val list: ArrayList<DataItem> = list

    private inner class View1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var message: TextView = itemView.findViewById(R.id.textView_1)
        fun bind(position: Int) {
            var recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }

    private inner class View2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var message: TextView = itemView.findViewById(R.id.textView_2)
        fun bind(position: Int) {
            var recyclerViewModel = list[position]
            message.text = recyclerViewModel.textData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == VIEW_TYPE_1) {
            return View1ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_1_view, parent, false))
        }
            return View2ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_2, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(list[position].viewType == VIEW_TYPE_1) {
            (holder as View1ViewHolder).bind(position)
        } else {
            (holder as View2ViewHolder).bind(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}