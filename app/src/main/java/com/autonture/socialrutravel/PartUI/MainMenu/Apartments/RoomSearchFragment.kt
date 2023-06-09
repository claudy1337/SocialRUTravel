package com.autonture.socialrutravel.PartUI.MainMenu.Apartments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.*
import com.autonture.socialrutravel.databinding.FragmentRoomSearchBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class RoomSearchFragment : Fragment() {

    private lateinit var binding: FragmentRoomSearchBinding
    private val adapterApartment = ApartmentAdapter(ConstantsApartment.getApartmentData())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        adapterApartment.onItemClick = {
            val result = it.address
            setFragmentResult("requestRoomKey", bundleOf("bundleRoomKey" to result))
            MAIN.navController.navigate(R.id.action_searchApartments_to_apartmentFragment)
        }
    }
    private fun init() {
        binding.apply {
            searchRoom.layoutManager = LinearLayoutManager(context)
            searchRoom.adapter = adapterApartment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRoomSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = RoomSearchFragment()
    }
}