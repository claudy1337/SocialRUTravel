package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers.SearchCityAdapter
import com.autonture.socialrutravel.PartUI.MainMenu.Tours.Recyclers.TourHorizontalAdapter
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.ConstantsTour
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.databinding.FragmentHomeTourBinding
import com.autonture.socialrutravel.databinding.FragmentSearchPlaceListBinding

class SearchPlaceListFragment : Fragment() {

    private lateinit var binding: FragmentSearchPlaceListBinding
    private val adapterSearchCity = SearchCityAdapter(ConstantsTour.getTourData())
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        adapterSearchCity.onItemClick = {
            val result = it.name
            setFragmentResult("requestTourKey", bundleOf("bundleTourKey" to result))
            MAIN.navController.navigate(R.id.action_searchPlaceListFragment2_to_mainTour)
        }
    }
    private fun init(){
        binding.apply {
            searchCity.layoutManager = LinearLayoutManager(context)
            searchCity.adapter = adapterSearchCity
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