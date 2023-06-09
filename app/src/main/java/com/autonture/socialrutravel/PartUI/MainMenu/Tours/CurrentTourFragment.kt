package com.autonture.socialrutravel.PartUI.MainMenu.Tours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.*
import com.autonture.socialrutravel.databinding.FragmentCurrentTourBinding



class CurrentTourFragment : Fragment() {
    private lateinit var binding: FragmentCurrentTourBinding
    private val adapterPlace = TopPlaceAdapter(ConstantsPlace.getPlaceData())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        adapterPlace.onItemClick = {
            val result = it.name
            setFragmentResult("requestPlaceKey", bundleOf("bundlePlaceKey" to result))
            MAIN.navController.navigate(R.id.action_mainTour_to_currentPlaceFragment)
        }
    }

    private fun init(){
        binding.topPlaceList.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.topPlaceList.adapter = adapterPlace
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("requestTourKey") { key, bundle ->
            val result = bundle.getString("bundleTourKey")
            binding.textView3.text = result
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