package com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.PlaceClass
import com.autonture.socialrutravel.Utilis.TourClass
import com.autonture.socialrutravel.WorkApi.Models.Towns
import com.autonture.socialrutravel.databinding.PlaceItemBinding
import com.autonture.socialrutravel.databinding.SearchCityItemBinding

class SearchCityAdapter : ListAdapter<Towns, SearchCityAdapter.Holder>(Comparator()) {

    var onItemClick: ((Towns) -> Unit)? = null
    class Holder(view: View):RecyclerView.ViewHolder(view){
        private val binding = SearchCityItemBinding.bind(view)
        fun bind(town:Towns) = with(binding){
            cityName.text = town.name
            cityTitle.text = town.description
        }
    }
    class Comparator: DiffUtil.ItemCallback<Towns>(){
        override fun areItemsTheSame(oldItem: Towns, newItem: Towns): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Towns, newItem: Towns): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.search_city_item, parent, false)
        return Holder(view)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
       // val towns = apartmentList[position]
        holder.bind(getItem(position))
       // holder.itemView.setOnClickListener {
       //     onItemClick?.invoke(towns)
       // }
    }


}