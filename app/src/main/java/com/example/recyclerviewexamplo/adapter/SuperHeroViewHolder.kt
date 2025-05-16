package com.example.recyclerviewexamplo.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexamplo.Element
import com.example.recyclerviewexamplo.R

class ElementViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvName: TextView = view.findViewById(R.id.tvName)

    fun render(element: Element) {
        tvName.text = element.name
    }
}
