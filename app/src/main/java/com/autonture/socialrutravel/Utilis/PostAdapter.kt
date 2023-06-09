package com.autonture.socialrutravel.Utilis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.databinding.UserPostItemBinding

class PostAdapter (private val postList: ArrayList<PostClass>): RecyclerView.Adapter<PostAdapter.EntriesHolder>() {


    var onItemClick: ((PostClass) -> Unit)? = null

    class EntriesHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = UserPostItemBinding.bind(item)

        fun bind(entries: PostClass) = with(binding) {
            imagePost.setImageResource(entries.image)
            userLoginTxt.text = entries.userLogin
            userNameTxt.text = entries.userName
            titleTxt.text = entries.title

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntriesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_post_item, parent, false)
        return EntriesHolder(view)
    }

    override fun onBindViewHolder(holder: EntriesHolder, position: Int) {
        val posts = postList[position]
        holder.bind(postList[position])

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(posts)
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
    fun addEntries(entries: PostClass){
        postList.add(entries)
        notifyDataSetChanged()
    }

}