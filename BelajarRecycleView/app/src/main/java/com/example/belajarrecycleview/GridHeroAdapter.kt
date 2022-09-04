package com.example.belajarrecycleview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridHeroAdapter(val listHero : ArrayList<Hero>) : RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {
        private lateinit var onItemClickCallback: OnItemClickCallback
        fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
            this.onItemClickCallback = onItemClickCallback
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_hero,parent, false)
        return GridViewHolder(view)
    }
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listHero[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listHero[holder.adapterPosition])}
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Hero)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}