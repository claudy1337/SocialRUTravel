package com.autonture.socialrutravel.Utilis

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.CurrentTourFragment
import com.autonture.socialrutravel.R
import com.makeramen.roundedimageview.RoundedImageView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.NonDisposableHandle.parent

class TopPlaceAdapter internal constructor(
    private val postList: ArrayList<PlaceClass>
) :
    RecyclerView.Adapter<TopPlaceAdapter.ListViewHolder>() {

    var onItemClick: ((PlaceClass) -> Unit)? = null


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val postImageView: RoundedImageView = itemView.findViewById(R.id.imagePost)

        fun setPostImage(postItem: PlaceClass) {
            postImageView.setImageResource(postItem.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.top_place_item, parent, false)
        return ListViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.setPostImage(postList[position])
        val posts = postList[position]
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(posts)
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}