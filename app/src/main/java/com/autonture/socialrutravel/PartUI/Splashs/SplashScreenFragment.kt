package com.autonture.socialrutravel.PartUI.Splashs

import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {

    lateinit var binding: FragmentSplashScreenBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setOnClickListener {
            SPLASHMain.navController.navigate(R.id.action_splashScreenFragment_to_authorizationActivity)
        }

        val timer = object: CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.progressCircular.apply {
                    progressBarColor = Color.WHITE
                    backgroundProgressBarColor = 656565;
                }
            }

            override fun onFinish() {
                SPLASHMain.navController.navigate(R.id.action_splashScreenFragment_to_securityCodeFragment)
            }
        }
        timer.start()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashScreenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SplashScreenFragment()
    }
}