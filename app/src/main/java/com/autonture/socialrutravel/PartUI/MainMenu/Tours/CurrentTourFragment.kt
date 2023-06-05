package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.databinding.FragmentCurrentTourBinding



class CurrentTourFragment : Fragment() {
    private lateinit var binding: FragmentCurrentTourBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardPost.setOnClickListener {
            MAIN.navController.navigate(R.id.action_mainTour_to_currentPlaceFragment)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCurrentTourBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = CurrentTourFragment()
    }
}