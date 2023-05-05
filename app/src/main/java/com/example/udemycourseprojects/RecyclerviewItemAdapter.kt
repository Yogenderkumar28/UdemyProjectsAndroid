package com.example.udemycourseprojects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerviewItemAdapter internal constructor(private val itemList: ArrayList<Items>) :
    RecyclerView.Adapter<RecyclerviewItemAdapter.MyViewHolder>(){
    private var clickListener: ClickListener<Items>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        holder.name.text = item.name
        holder.price.text = item.price
        holder.itemLayout.setOnClickListener { v -> clickListener!!.onClick(v, item, position)}
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setOnItemClickListener(clickListener: ClickListener<Items>) {
        this.clickListener = clickListener
    }

    inner class MyViewHolder(itemView: View): ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.tv_name)
        var price: TextView = itemView.findViewById(R.id.tv_price)
        var itemLayout: CardView = itemView.findViewById(R.id.item_layout)
    }
}