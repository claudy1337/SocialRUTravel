package com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.PlaceClass
import com.autonture.socialrutravel.databinding.PlaceItemBinding

class PlaceHorizontalAdapter (private val entriesList: ArrayList<PlaceClass>): RecyclerView.Adapter<PlaceHorizontalAdapter.EntriesHolder>() {

    var onItemClick: ((PlaceClass) -> Unit)? = null
    class EntriesHolder(item: View):RecyclerView.ViewHolder(item){
        val binding =  PlaceItemBinding.bind(item)

        fun bind(entries: PlaceClass) = with(binding){
            imgPlace.setImageResource(entries.img)
            namePlace.text = entries.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntriesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return EntriesHolder(view)
    }

    override fun getItemCount(): Int {
        return entriesList.size
    }

    override fun onBindViewHolder(holder: EntriesHolder, position: Int) {
        val posts = entriesList[position]
        holder.bind(entriesList[position])
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(posts)
        }
    }
}