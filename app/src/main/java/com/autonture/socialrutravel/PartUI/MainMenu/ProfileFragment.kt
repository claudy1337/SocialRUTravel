package com.autonture.socialrutravel.PartUI.MainMenu

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.SPLASHMain
import com.autonture.socialrutravel.Utilis.TABProfile
import com.autonture.socialrutravel.databinding.FragmentProfileBinding
import com.autonture.socialrutravel.databinding.FragmentSplashScreenBinding
import com.google.android.material.tabs.TabLayout


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tablayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {

            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
                //update повторное нажатие на вкладку
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //update потом запуск первой страницы
            }
        })
        binding.swipeRefresh.setOnRefreshListener{
            Handler().postDelayed(Runnable {
                binding.swipeRefresh.isRefreshing = false
            }, 2000)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}