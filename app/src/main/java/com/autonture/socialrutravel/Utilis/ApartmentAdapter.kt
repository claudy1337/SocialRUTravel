package com.autonture.socialrutravel.Utilis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.databinding.SearchRoomItemBinding
import com.autonture.socialrutravel.databinding.UserPostItemBinding

class ApartmentAdapter (private val apartmentList: ArrayList<ApartmentClass>): RecyclerView.Adapter<ApartmentAdapter.EntriesHolder>() {
    var onItemClick: ((ApartmentClass) -> Unit)? = null

    class EntriesHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = SearchRoomItemBinding.bind(item)

        fun bind(entries: ApartmentClass) = with(binding) {
            imgRoom.setImageResource(entries.img)
            roomAddress.text = entries.address
            roomOwner.text = entries.ownerPhone
            roomRating.text = entries.rating.toString()
            roomPrice.text = entries.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntriesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_room_item, parent, false)
        return ApartmentAdapter.EntriesHolder(view)
    }

    override fun getItemCount(): Int {
        return apartmentList.size
    }

    override fun onBindViewHolder(holder: EntriesHolder, position: Int) {
        val posts = apartmentList[position]
        holder.bind(apartmentList[position])

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(posts)
        }
    }
    fun addEntries(entries: ApartmentClass){
        apartmentList.add(entries)
        notifyDataSetChanged()
    }


}