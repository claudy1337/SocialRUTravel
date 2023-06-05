package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.databinding.FragmentHomeTourBinding
import com.autonture.socialrutravel.databinding.FragmentSearchPlaceListBinding

class SearchPlaceListFragment : Fragment() {

    private lateinit var binding: FragmentSearchPlaceListBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtsearch.setOnClickListener {
            MAIN.navController.navigate(R.id.action_searchPlaceListFragment2_to_mainTour)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchPlaceListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = SearchPlaceListFragment()
    }
}