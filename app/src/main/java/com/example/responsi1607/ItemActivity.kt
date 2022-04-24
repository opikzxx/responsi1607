package com.example.responsi1607

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val daftarmenuList = listOf<DaftarMenu>(
            DaftarMenu(R.drawable.burger, "Burger", "Deskripsi Burger"),
            DaftarMenu(R.drawable.hotdog, "Hotdog", "Deskripsi Hotdog")
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MenuAdapter(this, daftarmenuList){

        }
    }
}