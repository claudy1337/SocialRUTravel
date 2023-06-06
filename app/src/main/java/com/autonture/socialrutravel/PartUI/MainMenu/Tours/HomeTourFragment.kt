package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout.DetailPostActivity
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers.PlaceHorizontalAdapter
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers.TourHorizontalAdapter
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.ConstantsPlace
import com.autonture.socialrutravel.Utilis.ConstantsTour
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.databinding.FragmentHomeTourBinding


class HomeTourFragment : Fragment() {


    private lateinit var binding: FragmentHomeTourBinding
    private val adapterPlace = PlaceHorizontalAdapter(ConstantsPlace.getPlaceData())
    private val adapterTour = TourHorizontalAdapter(ConstantsTour.getTourData())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val placeFragment = CurrentPlaceFragment()
        val tourFragment = CurrentTourFragment()

        init()
        binding.searchRegion.setOnClickListener {
            MAIN.navController.navigate(R.id.action_searchTour_to_searchPlaceListFragment2)
        }

        adapterPlace.onItemClick = {
            val result = it.name
            setFragmentResult("requestPlaceKey", bundleOf("bundlePlaceKey" to result))
            MAIN.navController.navigate(R.id.action_searchTour_to_currentPlaceFragment)
        }
        adapterTour.onItemClick = {
            val result = it.name
            setFragmentResult("requestTourKey", bundleOf("bundleTourKey" to result))
            MAIN.navController.navigate(R.id.action_searchTour_to_mainTour)
        }
    }
    private fun init(){
        binding.apply {
            placeList.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            tourList.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            placeList.adapter = adapterPlace
            tourList.adapter = adapterTour
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