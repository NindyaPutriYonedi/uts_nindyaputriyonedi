package com.nindy.uts_nindyaputriyonedi.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nindy.uts_nindyaputriyonedi.R
import com.nindy.uts_nindyaputriyonedi.RecycleActivity
import com.nindy.uts_nindyaputriyonedi.detailorder
import com.nindy.uts_nindyaputriyonedi.model.model

class adapter(
    val itemList: ArrayList<model>,
    val getActivity: RecycleActivity
    ):
        RecyclerView.Adapter<adapter.MyViewHolder>()
    {
        class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
            var itemImage : ImageView
            var itemText : TextView
            var detailMakanan : TextView

            init {
                itemImage =itemView.findViewById(R.id.gambar) as ImageView
                itemText =itemView.findViewById(R.id.nama) as TextView
                detailMakanan = itemView.findViewById(R.id.detailMakanan) as TextView
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val nView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
            return MyViewHolder(nView)
        }

        override fun getItemCount(): Int {
            return itemList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.itemImage.setImageResource(itemList[position].gambar)
            holder.itemText.setText(itemList[position].nama)
            holder.itemText.setText(itemList[position].detailMakanan)

            holder.itemView.setOnClickListener(){
                val intent =Intent(getActivity, detailorder::class.java)
                intent.putExtra("image",itemList[position].gambar)
                intent.putExtra("text",itemList[position].nama)
                getActivity.startActivity(intent)
            }
        }
}