package com.autonture.socialrutravel.PartUI.MainMenu.Apartments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.databinding.FragmentApartmentBinding


class ApartmentFragment : Fragment() {

    private lateinit var binding:FragmentApartmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApartmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("requestRoomKey") { key, bundle ->
            val result = bundle.getString("bundleRoomKey")
            binding.txtName.text = result
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = ApartmentFragment()
    }
}