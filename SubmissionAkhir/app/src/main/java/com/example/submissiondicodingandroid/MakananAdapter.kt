package com.example.submissiondicodingandroid

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MakananAdapter(val FoodList : ArrayList<Makanan>) : RecyclerView.Adapter<MakananAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, image, description) = FoodList[position]
        Glide.with(holder.itemView.context)
            .load(image)
            .apply(RequestOptions())
            .into(holder.imgFoodPhoto)

        holder.tvFoodName.text = name

        val iContent = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveData = Intent(iContent, DeskripsiMakanan::class.java)
            moveData.putExtra(DeskripsiMakanan.EXTRA_NAME, name)
            moveData.putExtra(DeskripsiMakanan.EXTRA_PHOTO, image)
            moveData.putExtra(DeskripsiMakanan.EXTRA_DETAIL, description)
            iContent.startActivity(moveData)
        }
    }

    override fun getItemCount(): Int {
        return FoodList.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvFoodName : TextView = itemView.findViewById(R.id.tv_food_name)
        var imgFoodPhoto : ImageView = itemView.findViewById(R.id.img_food_photo)
    }
}