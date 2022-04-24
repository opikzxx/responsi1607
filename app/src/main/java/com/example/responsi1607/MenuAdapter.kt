package com.example.responsi1607

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val context: Context, private val daftarmenu: List<DaftarMenu>, val listener:(DaftarMenu) -> Unit)
    : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    class MenuViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgMenu = view.findViewById<ImageView>(R.id.img_view)
        val Title = view.findViewById<TextView>(R.id.txt_tittle)
        val Subtitle = view.findViewById<TextView>(R.id.txt_subtittle)

        fun bindView(daftarMenu: DaftarMenu, listener: (DaftarMenu) -> Unit){
            imgMenu.setImageResource(daftarMenu.imgMenu)
            Title.text = daftarMenu.Title
            Subtitle.text = daftarMenu.Subtitle
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bindView(daftarmenu[position], listener)
    }

    override fun getItemCount(): Int = daftarmenu.size

}