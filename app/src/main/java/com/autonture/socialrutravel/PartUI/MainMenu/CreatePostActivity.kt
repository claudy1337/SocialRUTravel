package com.autonture.socialrutravel.PartUI.MainMenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.databinding.ActivityCreatePostBinding
import com.autonture.socialrutravel.databinding.ActivityMainBinding

class CreatePostActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreatePostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreatePostBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}