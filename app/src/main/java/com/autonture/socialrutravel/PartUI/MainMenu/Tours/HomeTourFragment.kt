package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.FragmentHomeTourBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class HomeTourFragment : Fragment() {

    private lateinit var binding: FragmentHomeTourBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtv.setOnClickListener {
            MAIN.navController.navigate(R.id.action_searchTour_to_searchPlaceListFragment2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeTourBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        fun newInstance() = HomeTourFragment()
    }
}