package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.Utilis.TourMAIN
import com.autonture.socialrutravel.databinding.FragmentSearchPlaceBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class SearchPlaceFragment : Fragment() {

    private lateinit var binding: FragmentSearchPlaceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchPlaceBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SearchPlaceFragment()
    }
}