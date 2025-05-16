package com.example.recyclerviewexamplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexamplo.adapter.ElementAdapter
import com.example.recyclerviewexamplo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val elementList: List<Element> = ElementProvider.elementList
    private lateinit var adapter: ElementAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = ElementAdapter(elementList)
        binding.recyclerElement.layoutManager = LinearLayoutManager(this)
        binding.recyclerElement.adapter = adapter
    }
}
