package com.autonture.socialrutravel.PartUI.MainMenu.Apartments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.MAIN
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.databinding.FragmentRoomSearchBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding


class RoomSearchFragment : Fragment() {

    private lateinit var binding: FragmentRoomSearchBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtRoomSearch.setOnClickListener {
            MAIN.navController.navigate(R.id.action_searchApartments_to_apartmentFragment)
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