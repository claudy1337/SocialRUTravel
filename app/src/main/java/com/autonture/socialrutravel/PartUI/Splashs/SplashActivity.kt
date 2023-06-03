package com.autonture.socialrutravel.PartUI.Splashs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var bindingSplash: ActivitySplashBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingSplash = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(bindingSplash.root)
        navController = Navigation.findNavController(this, R.id.nav_splash_host_fragment)
        SPLASHMain = this
    }
}