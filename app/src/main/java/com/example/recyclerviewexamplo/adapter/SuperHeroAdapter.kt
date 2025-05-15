package com.example.recyclerviewexamplo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexamplo.Element
import com.example.recyclerviewexamplo.R

class ElementAdapter(
    private var elementList: List<Element>
) : RecyclerView.Adapter<ElementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ElementViewHolder(layoutInflater.inflate(R.layout.item_element, parent, false))
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {
        val item = elementList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = elementList.size

    fun updateElements(newList: List<Element>) {
        elementList = newList
        notifyDataSetChanged()
    }
}
