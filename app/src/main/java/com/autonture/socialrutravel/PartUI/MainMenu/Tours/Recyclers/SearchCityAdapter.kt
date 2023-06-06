package com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.PlaceClass
import com.autonture.socialrutravel.Utilis.TourClass
import com.autonture.socialrutravel.databinding.PlaceItemBinding
import com.autonture.socialrutravel.databinding.SearchCityItemBinding

class SearchCityAdapter(private val entriesList: ArrayList<TourClass>): RecyclerView.Adapter<SearchCityAdapter.EntriesHolder>() {

    var onItemClick: ((TourClass) -> Unit)? = null
    class EntriesHolder(item: View): RecyclerView.ViewHolder(item){
        val binding =  SearchCityItemBinding.bind(item)

        fun bind(entries: TourClass) = with(binding){
            cityName.text = entries.name
            cityTitle.text = entries.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntriesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_city_item, parent, false)
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