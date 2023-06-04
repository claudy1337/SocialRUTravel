package com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.PostClass
import com.autonture.socialrutravel.databinding.ActivityDetailPostBinding

class DetailPostActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val entries = intent.getParcelableExtra<PostClass>("entries")
        if (entries != null){

            binding.Titletxt.text = entries.title
            binding.Logintxt.text = entries.userLogin
            binding.Nametxt.text = entries.userName
            binding.imgPost.setImageResource(entries.image)
        }

    }
}