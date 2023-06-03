package com.autonture.socialrutravel.PartUI.MainMenu.ProfileTabLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.databinding.FragmentSaveUserPostBinding


class SaveUserPostFragment : Fragment() {
    private lateinit var binding:FragmentSaveUserPostBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaveUserPostBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = SaveUserPostFragment()
    }
}