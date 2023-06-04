package com.autonture.socialrutravel.PartUI.MainMenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R


class SettingProfileFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_setting_profile, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = SettingProfileFragment()
    }
}