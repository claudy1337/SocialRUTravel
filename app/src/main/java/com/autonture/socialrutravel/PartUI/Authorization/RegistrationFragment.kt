package com.autonture.socialrutravel.PartUI.Authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.socialrutravel.R
import com.autonture.socialrutravel.Utilis.AUTHMain
import com.autonture.socialrutravel.databinding.FragmentRegistrationBinding
import com.autonture.socialrutravel.databinding.FragmentSignInBinding


class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtBackAuth.setOnClickListener {
            AUTHMain.navController.navigate(R.id.action_registrationFragment_to_signInFragment)
        }
        binding.textView5.setOnClickListener {

            AUTHMain.navController.navigate(R.id.action_registrationFragment_to_mainActivity2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = RegistrationFragment()
    }
}