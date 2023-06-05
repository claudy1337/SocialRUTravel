package com.autonture.socialrutravel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.autonture.socialrutravel.PartUI.Splashs.SplashActivity
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        //val intent = Intent(this@MainActivity, SplashActivity::class.java)
        //startActivity(intent)
        navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)
        MAIN = this
        setupWithNavController(bindingMain.bottomNavigationView,navController)

       //
       // setupWithNavController(bindingMain.bottomNavigationView,navController)
    }
}