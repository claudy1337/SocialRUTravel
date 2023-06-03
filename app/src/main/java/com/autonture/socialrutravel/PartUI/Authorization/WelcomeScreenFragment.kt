package com.autonture.socialrutravel.PartUI.Authorization

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.FragmentSecurityCodeBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding
import com.autonture.socialrutravel.databinding.FragmentWelcomeScreenBinding


class WelcomeScreenFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_welcomeScreenFragment2_to_signInFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeScreenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = WelcomeScreenFragment()
    }
}